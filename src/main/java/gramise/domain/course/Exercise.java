package gramise.domain.course;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Exercise extends AbstractPersistable<Long> {

    @NotBlank
    @Length(min = 1, max = 40)
    private String name;

    @NotBlank
    @Length(min = 1, max = 200)
    private String help;

    @ManyToOne
    private List<Word> words;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
