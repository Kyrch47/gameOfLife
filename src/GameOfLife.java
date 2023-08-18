public class GameOfLife {
    private int height;
    private int width;
    private int speed;
    private int generations;
    private String population;
    private boolean parametersCheck = true;

    public GameOfLife(String[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            String[] temp = parameters[i].split("=");

            switch (temp[0]) {
                case "h":
                    setHeight(temp[i]);
                case "w":
                    this.width = Integer.parseInt(temp[1]);
                case "s":
                    this.speed = Integer.parseInt(temp[1]);
                case "g":
                    this.generations = Integer.parseInt(temp[1]);
                case "p":
                    this.population = "testing";
            }
            System.out.println("end");
        }

    }

    public void startGame() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(String height) {
        try {
            this.height = Integer.parseInt(height);

        } catch (Exception e) {
            System.out.println("Valor inválido atribuido ao parâmetro h.");
            this.height = 0;
        }

        if (this.height <= 0) {
            parametersCheck = false;
        } else if (this.height > 50) {
            this.height = 50;
        }
        System.out.println(this.height);

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
