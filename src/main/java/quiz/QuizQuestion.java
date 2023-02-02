package quiz;

public class QuizQuestion {

    private String name;
    private String imgSource;

    public QuizQuestion(String name, String imgSource) {
        this.name = name;
        this.imgSource = imgSource;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the imgSource
     */
    public String getImgSource() {
        return imgSource;
    }

    /**
     * @param imgSource the imgSource to set
     */
    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

}
