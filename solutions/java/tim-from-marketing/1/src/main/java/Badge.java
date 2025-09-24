class Badge {
    public String print(Integer id, String name, String department) {
        if(department != null){
            department = department.toUpperCase();    
        }
        
        if(id==null && department==null){
            return name + " - " + "OWNER";
        } else if (id != null && department == null){
            return "["+id+"]"+" - "+name+" - "+ "OWNER";
        }else if (id ==null && department != null){
            return name + " - " + department;
        }
        else{
            return "["+id+"]"+" - "+name+" - "+department;
        }
        
    }
}
