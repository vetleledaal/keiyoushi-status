# Extension Validation Report

- Extension: tachiyomi-fr.rimuscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 203984087587807085
- Source name: Rimu Scans
- Source language: fr
- Selected manga input: popular offset 0: Tales Of Demons And Gods (`.../tales-of-demons-and-gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tales Of Demons And Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Dungeon House (`.../dungeon-house`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Latna Saga: Survival of a Sword King (`.../latna-saga-survival-of-a-sword-king`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Insanely Talented Player (`.../insanely-talented-player`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tales Of Demons And Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales Of Demons And Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 971 | Chapitre 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tales Of Demons And Gods, URL=`.../tales-of-demons-and-gods` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=My Wife Is a Demon Queen, URL=`.../my-wife-is-a-demon-queen` at page 1 offset 4 and page 2 offset 8, title=Bad Born Blood, URL=`.../bad-born-blood` at page 1 offset 11 and page 2 offset 11, title=Return of the Mount Hua Sect, URL=`.../return-of-the-mount-hua-sect` at page 1 offset 15 and page 2 offset 15, title=Insanely Talented Player, URL=`.../insanely-talented-player` at page 1 offset 22 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rimuscan.fr/.../cover-1790548536729.jpg` (image/jpeg, 109017 bytes, 500x707) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tales-of-demons-and-gods` |  |  |  |
| details thumbnail URL | PASS | `https://rimuscan.fr/.../cover-1790548536729.jpg` |  |  |  |
| details author | PASS | Fa Biao De Wo Niu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Action, Art Martiaux, Aventure, Combat, Fantasy, Shonen, Surnaturel |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Le monde qui entourait les Montagnes Ancestrales était occupé par de dangereuses créatures et ceux qui y vivaient étaient isolés de l’extérieur depuis des centaines d’années. On raconte que, lorsque l’humanité était à son apogée, elle était composée de puissants empires qui s’étaient depuis effondrés. Cependant, grâce à son emplacement bien dissimulé, une ville fut préservée de « l’Âge Sombre » si bien que malgré les assauts incessants des créatures, elle survécut aux guerres dévastatrices et fut reconstruite encore et encore. Ses murs cent fois rebâtis s’élevaient tel un invincible monument ! Cette ville représentait l’espoir de l’humanité, on la nommait… Illustria !<br><br>C’est là que va renaître Nie Li, après avoir succombé en affrontant 6 créatures divines et leur maître. Mais cette seconde chance que la providence lui a accordée, si elle l’a renvoyé dans le passé de plusieurs années avant la chute d’Illustria, lui a également rendu son corps d’adolescent pas très doué… Son seul atout, le vaste savoir acquis au cours de sa précédente vie d’errance et d’aventures, n’a été conservé qu’en perdant son trésor le plus précieux, le Livre du Démon du Temps. Notre héros parviendra-t-il à devenir assez fort pour changer son destin et celui de ses compagnons avec le peu de temps dont il dispose avant la destruction d’Illustria ?<br><br>Telle est l’histoire de Tales of Demons and Gods ! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 971 chapters |  |  |  |
| chapter dates | PASS | 971 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rimuscan.fr/.../001.jpg <redacted query values: v>` (image/jpeg, 197918 bytes, 800x1131) |  |  |  |
