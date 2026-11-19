# Extension Validation Report

- Extension: tachiyomi-fr.mangakawaii-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1384625280015637699
- Source name: Mangakawaii
- Source language: fr
- Selected manga input: popular offset 0: Tales of Demons and Gods (`.../tales-of-demons-and-gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | lvl 999 villageois (`.../LV999-villageois`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Raising Villains The Right Way (`.../raising-villains-the-right-way`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Legendary Youngest Son of the Marquis House (`.../legendary-youngest-son-of-the-marquis-house`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 44 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tales of Demons and Gods, URL=`.../tales-of-demons-and-gods` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangakawaii.fr/.../cover_250x350.webp <redacted query values: v>` (image/webp (encoding: lossy), 28804 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tales-of-demons-and-gods` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangakawaii.fr/.../cover_250x350.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Mad Snail, Fa Biao De Wo Niu, Fabiao De Woniu |  |  |  |
| details artist | PASS | Mad Snail, Ruotai Jiang, Jiang Ruo Tai |  |  |  |
| details genres | PASS | Action, Aventure, Comédie, Drame, Fantastique, Arts Martiaux, Romance, Surnaturel |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Le monde qui entourait les Saintes Montagnes Ancestrales était occupé par les créatures du Blizzard et ceux qui y vivaient étaient isolés de l'extérieur depuis des centaines d'années. On disait que, quand l'humanité était à son apogée, elle était composée de puissants empires qui s'étaient depuis effondrés. Cependant, grâce à son emplacement bien dissimulé, une ville fut préservée de "l'Age Sombre" si bien que malgré les assauts incessants des créatures, elle survécut aux guerres dévastatrices et fut reconstruite encore et encore. Ses murs cent fois rebâtis s'élevaient tel un monument invincible ! Cette ville représentait l'espoir de l'humanité, on la nommait... La ville de la gloire ! chaps supprimés au fur et à mesure des sorties en france des tomes<br><br>Alternative Names: 妖神记 · Yaoshenji · Yêu Thần Ký · TODAG |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
