# Extension Validation Report

- Extension: tachiyomi-fr.aralosbd-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7086384324753337104
- Source name: AralosBD
- Source language: fr
- Selected manga input: popular offset 0: GhostBlade (`https://aralosbd.fr/.../display <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | GhostBlade (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Project SHaDe (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Akuma No Uta (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Cross Island (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | GhostBlade (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | GhostBlade (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 32 | 0 - L'Œil Céleste (`https://aralosbd.fr/.../chapter <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=GhostBlade, URL=`https://aralosbd.fr/.../display <redacted query values: id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 97/97 listing manga have titles and URLs; popular: all absolute; popular_next: all absolute; latest: all absolute; latest_next: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://aralosbd.fr/.../display <redacted query values: id>`, popular entry 2: `https://aralosbd.fr/.../display <redacted query values: id>`, popular entry 3: `https://aralosbd.fr/.../display <redacted query values: id>` |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aralosbd.fr/.../420 <redacted query values: c>` (image/jpeg, 80688 bytes, 688x960) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://aralosbd.fr/.../display <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://aralosbd.fr/.../420 <redacted query values: c>` |  |  |  |
| details author | PASS | Wlop |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | En cours, Chinois, Webtoon, Seinen, Action, Fantastique, Couleurs |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Il y a fort longtemps au royaume de Nera, les fidèles humains érigèrent une tour en signe de leur respect pour leur déesse Nera.<br>La déesse Nera, profondément touchée par la foi de ces derniers, ouvrit une porte au sommet de la tour pour les récompenser. Cette porte mystique était connectée à un autre monde. Elle fut dénommée "l'Œil céleste".<br>Mais un jour...<br><br>Un récit aux dessins à couper le souffle, par le célèbre dessinateur WLOP ! N'attendez pas et lancez-vous dans cette lecture extraordinaire !<br><br>Pour suivre l'auteur :<br><br> https://www.patreon.com/.../wlop<br><br> https://www.deviantart.com/.../wlop<br><br> https://www.instagram.com/.../wlop<br><br> https://www.youtube.com/.../WLOP |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 32 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://aralosbd.fr/.../0 <redacted query values: c>` (image/jpeg, 1330198 bytes, 1640x2717) |  |  |  |
