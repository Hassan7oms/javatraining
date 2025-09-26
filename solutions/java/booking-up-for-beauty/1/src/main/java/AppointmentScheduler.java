import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime date= LocalDateTime.parse(appointmentDateDescription,parser);
        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        
        if(appointmentDate.isBefore(LocalDateTime.now())){
            return true;
        }else{
            return false;
        }
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        if(appointmentDate.getHour()>=12 && appointmentDate.getHour()<18){
            return true;
        }else
        {
            return false;
        }
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:mm a");
        String dayOfWeek = appointmentDate.format(dayFormat);
        String monthYear =  appointmentDate.format(monthFormat);
        String time = appointmentDate.format(timeFormat);
        return String.format("You have an appointment on %s, %s, at %s.",dayOfWeek,monthYear,time);
    }

    public LocalDate getAnniversaryDate() {
      LocalDate dateNow   = LocalDate.now();
      int year = dateNow.getYear();
        return LocalDate.of(year,9,15);
    }
}
