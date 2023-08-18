public class GameOfLife {
    private int height = 10;
    private int width = 10;
    private int speed = 1;
    private int generations = 20;
    private String population;

    public GameOfLife(String[] parameters) {
        for (String parameter : parameters) {
            String[] temp = parameter.replaceAll(" ", "").split("=");

            switch (temp[0]) {
                case "h" -> setHeight(temp[1]);
                case "w" -> setWidth(temp[1]);
                case "s" -> this.speed = Integer.parseInt(temp[1]);
                case "g" -> this.generations = Integer.parseInt(temp[1]);
                case "p" -> this.population = "testing";
            }
        }
    }

    public void startGame() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(String height) {
        try {
            if (Integer.parseInt(height) > 0 && Integer.parseInt(height) <= 50) {
                this.height = Integer.parseInt(height);
            } else if (Integer.parseInt(height) > 50) {
                this.height = 50;
                System.out.print("Value " + height + " for 'h' too high. Default value of " + this.height + " will be used.");
            } else {
                System.out.print("Invalid value for parameter 'h'. Default value of " + this.height + " will be used.");
            }

        } catch (Exception e) {
            System.out.print("Integer type required for parameter 'h'. Default value of " + this.height + " will be used.");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(String width) {
        try {
            if (Integer.parseInt(width) > 0 && Integer.parseInt(width) <= 50) {
                this.width = Integer.parseInt(width);
            } else if (Integer.parseInt(width) > 50) {
                this.width = 50;
                System.out.print("Value " + width + " for 'w' too high. Default value of " + this.width + " will be used.");
            } else {
                System.out.print("Invalid value for parameter 'w'. Default value of " + this.width + " will be used.");
            }

        } catch (Exception e) {
            System.out.print("Integer type required for parameter 'w'. Default value of " + this.width + " will be used.");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGenerations() {
        return generations;
    }

    public void setGenerations(int generations) {
        this.generations = generations;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
