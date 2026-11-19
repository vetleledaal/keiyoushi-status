# Extension Validation Report

- Extension: tachiyomi-fr.blossomscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5819845963401393451
- Source name: Blossom Scans
- Source language: fr
- Selected manga input: popular offset 0: Overgeared (Remake) (`.../overgeared-remake`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Overgeared (Remake) (`.../overgeared-remake`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | I’m the Max-Level Newbie (`.../im-the-max-level-newbie`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Logging Out Is Too Hard (`.../logging-out-is-too-hard`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | The Villain Family’s Strongest Butler (`.../the-villain-family-s-strongest-butler`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Overgeared (Remake) (`.../overgeared-remake`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Overgeared (Remake) (`.../overgeared-remake`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 327 | Chapitre 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Overgeared (Remake), URL=`overgeared-remake` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blossom-scans.com/.../1779047096431-j32oke.jpg` (image/jpeg, 35519 bytes, 280x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `overgeared-remake` |  |  |  |
| details thumbnail URL | PASS | `https://blossom-scans.com/.../1779047096431-j32oke.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comédie, Aventure, Fantaisie, Combat, Jeux vidéos |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Shin Youngwoo (Pseudo : Greed)\]<br>Le plus grand jeu de réalité virtuelle du monde, .<br>Que ce soit dans la réalité ou dans le jeu, la malchance l’a toujours suivi…<br>Jusqu’au jour où, au beau milieu d’une quête, il trouve par hasard un billet de loterie dans le jeu : le ‘Livre Rare de Pagma‘.<br>Il changea de classe pour devenir la seule classe légendaire qui reste la plus forte parmi plus de 2 milliards d’utilisateurs.<br><br>« Comment es-tu encore en vie… ?! »<br>« Eh bien, il n’y a rien de spécial… »<br>« Je suis Overgeared (suréquipé). »<br><br>« Greed », le joueur le plus fort qui s’est échappé de sa vie fatigante, malheureuse et cauchemardesque de débiteur.<br>Le boss final qui fera pleurer les nolifers arrive !<br>\[Connexion à <SATISFY>.\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 327 chapters |  |  |  |
| chapter dates | PASS | 327 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage1.blossom-scans.com/.../001.jpg <redacted query values: v>` (image/jpeg, 772402 bytes, 720x9274) |  |  |  |
