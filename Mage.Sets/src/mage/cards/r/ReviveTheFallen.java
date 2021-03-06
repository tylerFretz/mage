
package mage.cards.r;

import java.util.UUID;
import mage.abilities.effects.common.ClashWinReturnToHandSpellEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterCreatureCard;
import mage.target.common.TargetCardInGraveyard;

/**
 *
 * @author LoneFox
 */
public final class ReviveTheFallen extends CardImpl {

    public ReviveTheFallen(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{1}{B}");

        // Return target creature card from a graveyard to its owner's hand.
         this.getSpellAbility().addEffect(new ReturnToHandTargetEffect());
         this.getSpellAbility().addTarget(new TargetCardInGraveyard(new FilterCreatureCard("creature card in a graveyard")));
        // Clash with an opponent. If you win, return Revive the Fallen to its owner's hand.
        this.getSpellAbility().addEffect(ClashWinReturnToHandSpellEffect.getInstance());
    }

    public ReviveTheFallen(final ReviveTheFallen card) {
        super(card);
    }

    @Override
    public ReviveTheFallen copy() {
        return new ReviveTheFallen(this);
    }
}
