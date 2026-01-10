package skillforge;

class Module {
    private String moduleTitle;
    private int duration;

    public Module(String moduleTitle, int duration) {
        this.moduleTitle = moduleTitle;
        this.duration = duration;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }
}