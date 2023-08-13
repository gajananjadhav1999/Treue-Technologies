import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TaskReminder
{

    static class ReminderTask extends TimerTask 
    {
        private String taskDescription;

        public ReminderTask(String taskDescription) 
        {
            this.taskDescription = taskDescription;
        }

        public void run() 
        {
            System.out.println("Task executed at: " + new Date());
            System.out.println("Reminder: Don't forget to " + taskDescription);
        }
    }

    public static void main(String[] args)
    {
      
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        List<TimerTask> tasks = new ArrayList<>();

        while (true) 
        {
            System.out.println("====================================");
            System.out.println("||......ONLINE TASK REMINDER......||");
            System.out.println("====================================");
            System.out.println();
            System.out.print("!!  ENTER TASK NAME OR DISCRIPTION  !!");
            System.out.println();
            String taskDescription = scanner.nextLine();

            if(taskDescription.equalsIgnoreCase("exit"))
            {
                break;
            }

            System.out.print("Enter Task date and time in this order -> (yyyy-MM-dd HH:mm:ss)");
            System.out.println();
            String dueDateString = scanner.nextLine();

            System.out.print("IS THIS A RECURRING  TASK ? (YES/NO)");
            System.out.println();
            boolean isRecurring = scanner.nextLine().equalsIgnoreCase("YES");

            try 
            {
                Date dueDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dueDateString);

                if (isRecurring) 
                {
                    System.out.print("Enter recurring interval in minutes: ");
                    long interval = Long.parseLong(scanner.nextLine()) * 60 * 1000;

                    TimerTask recurringTask = new ReminderTask(taskDescription);
                    tasks.add(recurringTask);
                    timer.scheduleAtFixedRate(recurringTask, dueDate, interval);
                } 
                else 
                {
                    TimerTask oneTimeTask = new ReminderTask(taskDescription);
                    tasks.add(oneTimeTask);
                    timer.schedule(oneTimeTask, dueDate);
                }

                System.out.println("Task scheduled for : " + dueDate);
            } 
            catch (Exception e)  
            {
                System.out.println("Invalid input. Please enter the date in the specified format.");
            }
        }

        System.out.println("Scheduled tasks:");
        for (TimerTask task : tasks) 
        {
            System.out.println(((ReminderTask) task).taskDescription);
        }

        timer.cancel();
        scanner.close();
    }
}
