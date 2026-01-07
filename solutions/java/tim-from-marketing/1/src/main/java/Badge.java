class Badge {
    public String print(Integer id, String name, String department) {
        String idPrefix = (id == null) ? "" : "[" + id + "] - ";
        String departmentName = (department == null) ? "OWNER" : department.toUpperCase();

        return idPrefix + name + " - " + departmentName;
    }
}