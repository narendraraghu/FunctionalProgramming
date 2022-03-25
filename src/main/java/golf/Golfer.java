package golf;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Golfer implements Comparable<Golfer> {
    String first;
    String last;
    Integer score;

    @Override
    public int compareTo(Golfer golfer) {
        return score - golfer.score;
    }
}
