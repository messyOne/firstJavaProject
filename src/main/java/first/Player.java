package first;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Player {
    @NotBlank
    private String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
