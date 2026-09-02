# Extension Validation Report

- Extension: tachiyomi-en.atsumaru-v1.6.23
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2327480808438768017
- Source name: Atsumaru
- Source language: en
- Selected manga input: popular offset 0: Witch Hat Atelier (`.../2VgNt`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Witch Hat Atelier (`.../2VgNt`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Player (`.../QYt3`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Kengan Omega (`.../P0w0P`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | In the Bleak Midwinter; (`.../DHE2`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Witch Hat Atelier (`.../2VgNt`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Witch Hat Atelier (`.../2VgNt`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 346 | Chapter 0 (`.../0S_52R`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Witch Hat Atelier, URL=`2VgNt` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 162/162 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 162/162 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://atsu.moe/.../N3HO30V76uWZV9iG-large.avif` (image/avif (format: avif), 91144 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `2VgNt` |  |  |  |
| details thumbnail URL | PASS | `https://atsu.moe/.../N3HO30V76uWZV9iG-large.avif` |  |  |  |
| details author | PASS | Kamome Shirahama |  |  |  |
| details artist | PASS | Kamome Shirahama |  |  |  |
| details genres | PASS | Manga, Accidents, Amnesia, Body Horror, Character Growth, Child Protagonist, Conspiracy, Creative Female Lead, Determined Protagonist, Disability, European Ambience, Foreign, Friendship, Glasses-Wearing Male Lead, Iyashikei, LGBTQ+, Mages, Magic Books, Magic School, Male Demographic with Female Lead, Master-Disciple Relationship, Philosophy, Politics, Primarily Child Cast, Primarily Female Cast, Rehabilitation, School Life, Seinen, Travel, Coming of Age, Drawing, Elaborate, Ensemble Cast, Female Lead, Found Family, Magic, Medieval, Memory Manipulation, Revenge, School, Teachers, Witch, Young Female Lead, Abuse of Power, Child Female Lead, Dragons, Fantasy World, LGBTQ+ Characters, Mage Male Lead, Mahou Shoujo, Male Demographic with Female Author, Strong-Willed Female Lead, Witch Female Lead, Abusive Parents, Adult Female Character, Adult Male Character, Black Character, Black/Dark Magic, Books, Castle, Cheerful Female Lead, Child Abuse, Childhood Friends, Countryside, Curses, Determined Female Lead, Determined Male Lead, Disciple, Discrimination, Dreams, Famous Female Lead, Golden/Yellow-Eyed Protagonist, Hard-Working Female Lead, Hard-Working Protagonist, Important Non-Romantic Relationship, Kind female Lead, Library, Lifestyle Change, Long-Haired Female Character, Long-Haired Male Character, Mage Female Lead, Masked Character, Mentor, Mythical Beast, Nobility, Observant Female Lead, Optimistic Female Lead, Past Plays a Big Role, Pets, Plot Twist, Ruthless Character, Scheming Character, Secret Organizations, Secrets, Smart Female Lead, Smart Protagonist, Social Class Discrimination, Sorcerers, Sorcery, Spells, Strong-Willed Protagonist, Studious Female Lead, Tragic Past, Trauma, Traumatic Past, Twins, White/Silver-Haired Character, Adapted to Anime, Award Winning, Award-Nominated Work, Dark/Tan Skin Female Character, Europe, Female Empowerment, Flashbacks, Male Lead, Secret Identity, Yuri |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Rating**: 8.48/10<br>**Year**: 2016<br>**Views**: 15.5M<br><br><br>**Synopsis**: In a world where everyone takes wonders like magic spells and dragons for granted, Coco is a girl with a simple dream: she wants to be a witch. But everybody knows magicians are born, not made, and Coco was not born with a gift for magic. Resigned to her un-magical life, Coco is about to give up on her dream to become a witch … until the day she meets Qifrey, a mysterious, traveling magician. After secretly seeing Qifrey perform magic in a way she’s never seen before, Coco soon learns what everybody “knows” might not be the truth, and discovers that her magical dream may not be as far away as it may seem... <br><br>(Source: Kodansha USA) <br><br>*Notes:<br>\- Nominated for the 11th Manga Taishou Award in 2018.<br>\- Won the Daruma d'Or at Japan Expo in 2019.<br>\- Won Best U.S. Edition of International Material - Asia at the Eisner Awards in 2020.<br>\- Won the Best Manga Award at the Harvey Awards in 2020.*<br><br><br>**Alternative Names**:<br>- 고깔모자의 아틀리에<br>- Asrama Topi Lancip<br>- Atelier of Witch Hat<br>- Atelier of Witch Hat: Das Geheimnis der Hexen<br>- Ateliér špičatých klobouků<br>- Atelier spiczastych kapeluszy<br>- Atelierul Vrăjitoarelor<br>- Boszorkánysüveg–műhely<br>- Cadı Şapkası Atölyesi<br>- Das Geheimnis der Hexen<br>- El Atelier del Sombrero Puntiagudo<br>- El Atelier de Sombreros de Mago<br>- Heksehatt-atelieret<br>- L'Atelier des Sorciers<br>- Pondok Penyihir Topi Lancip<br>- Tongari Booshi no Atorie<br>- Tongari Bōshi no Atelier<br>- Tongari Bōshi no Atorie<br>- Tongari Boushi no Atelier<br>- Tongari Boushi no Atelier ~ Atelier of Witch Hat<br>- Tongari Boushi no Atorie<br>- Xưởng phép thuật<br>- Δ帽子<br>- Ателие за островърхи шапки<br>- Ателье колдовских колпаков<br>- Ательє чаклунських капелюхів<br>- ورشة قبعة الساحرة<br>- बोक्सी टोपीको एटलिएर<br>- จอมเวทฝึกหัดกับหมวกมหัศจรรย์<br>- とんがり帽子のアトリエ<br>- とんがり帽子のアトリエ ~ Atelier of Witch Hat<br>- 尖帽子的魔法工坊<br>- 尖帽子的魔法工房<br>- 魔法帽的工作室 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 346 chapters |  |  |  |
| chapter dates | PASS | 346 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://atsu.moe/.../2332ceb1f6a43dec.avif` (image/avif (format: avif), 150113 bytes, 1200x1374) |  |  |  |
