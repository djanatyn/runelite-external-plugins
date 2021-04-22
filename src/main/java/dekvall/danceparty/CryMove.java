package dekvall.danceparty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
enum CryMove implements Move
{
    CRY(860),
    ;

    private int animId;
    private int gfxId;

    CryMove(int animId)
    {
        this(animId, -1);
    }
}
