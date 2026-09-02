# Extension Validation Report

- Extension: tachiyomi-fr.sushiscanfr-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3196884165456788667
- Source name: Sushiscan.fr
- Source language: fr
- Selected manga input: popular offset 0: Solo Leveling (`.../na-honjaman-level-up`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Solo Leveling (`.../na-honjaman-level-up`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Ma bonne tutrice (`.../ma-bonne-tutrice`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | La Servante Secrète (`.../la-servante-secrete`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | I Became an Apartment Security Manager (`.../i-became-an-apartment-security-manager`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Solo Leveling (`.../na-honjaman-level-up`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Leveling (`.../na-honjaman-level-up`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 203 | Chapitre 00 (`.../solo-leveling-chapitre-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`.../na-honjaman-level-up` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sushiscan.fr/.../solo-leveling-210x300.png` (image/png, 117171 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../na-honjaman-level-up` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sushiscan.fr/.../solo-leveling.png` (image/png, 254258 bytes, 280x400) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Aventure, Fantastique, Shounen, Surnaturel, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Dix ans auparavant, des portails ont commencé à apparaître un peu partout dans le monde. Ces portails ont la particularité de connecter le monde à d’autres dimensions, donjons ou mondes parallèles. En même temps, certaines personnes ont développé des capacités afin de pouvoir chasser ces portails. On appelle ceux qui reçoivent un Éveil, des Chasseurs. Sung Jin Woo est considéré comme le plus faible des Chasseurs de rang E… Autrement dit le plus faible parmi les faibles. Il est tellement faible qu’il est surnommé par ses confrères, le « Faible ». Avec une équipe de Chasseurs, il se rend dans un donjon de rang D. Malheureusement, l’équipe se retrouve piégée dans une salle avec des monstres qui ne sont pas du tout du niveau du donjon… S’en suit un massacre… Et Sung Jin Woo, aux portes de la mort arrive à acquérir une capacité pour le moins étrange… Sung Jin Woo va-t-il réussir à devenir le plus puissant des Chasseurs tout en surmontant les épreuves et conspirations ?<br><br>Nom alternatif : Jogador Solo, Na Honjaman Level-Up, Only I Level Up, Ore Dake Level Up na Ken, Upando Sozinho, Поднятие уровня в одиночку, Тільки я візьму новий рівень, تکرو, 俺だけレベルアップな件, 俺だけレベルアップな件〜外伝〜, 我独自升级, 나 혼자만 레벨업, 나혼렙 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | LINT | All 203 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=203 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s22.anime-sama.me/.../1.jpg` (image/jpeg, 333674 bytes, 720x5000) |  |  |  |
