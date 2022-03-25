package task;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Task {
    private Integer id;
    private boolean active;
    private int duration;
    private String name;
}
