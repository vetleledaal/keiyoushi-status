# Extension Validation Report

- Extension: tachiyomi-fr.solarisscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 1172624746268381921
- Source name: Solaris Scans
- Source language: fr
- Selected manga input: popular offset 0: Fight Class 3 (`.../fight-class-3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Fight Class 3 (`.../fight-class-3`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Reborn Rich (`.../reborn-rich`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Blade of Wrath (`.../blade-of-wrath`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | PIGPEN (`.../pigpen`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Fight Class 3 (`.../fight-class-3`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fight Class 3 (`.../fight-class-3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 79 | Chapitre 1 (`.../chapitre-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fight Class 3, URL=`.../fight-class-3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://solaris-scans.fr/.../solaris-work-cover-u9-20260804160100-tsl4vmkoyq.webp` (image/webp (encoding: lossy), 107800 bytes, 706x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fight-class-3` |  |  |  |
| details thumbnail URL | PASS | `https://solaris-scans.fr/.../solaris-work-cover-u9-20260804160100-tsl4vmkoyq.webp` |  |  |  |
| details author | PASS | 2hakkk |  |  |  |
| details artist | PASS | 2hakkk |  |  |  |
| details genres | PASS | Action, Comédie, Drame, Psychologique, Thriller, Tragédie, Tranche de vie, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Un monde dans lequel la Corée est le Pays leader des sports de combats. Au lycée Nam-Il où les meilleurs et plus talentueux élèves en arts martiaux étudient, Jiu Ji-Tae se trouve soudainement entraîné avec eux alors qu'il n'est qu'un faiblard. En faisant disparaître ses défauts physiques à l'aide du Ju-Jitsu, pourra-t-il devenir le meilleur des classes de combat ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 79 chapters |  |  |  |
| chapter dates | PASS | 79 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://solaris-scans.fr/.../manga <redacted query values: catalog_sort>` to `https://solaris-scans.fr/.../manga` (1 redirects); popular: `https://solaris-scans.fr/.../manga <redacted query values: catalog_sort and catalog_page>` to `https://solaris-scans.fr/.../manga <redacted query values: catalog_page>` (1 redirects) |  |  |  |
| page load | PASS | `https://solaris-scans.fr/.../admin-ajax.php <redacted query values: action, solaris_img, r, m, c, u, e, p, sig, and v>` (image/webp (encoding: lossy), 124988 bytes, 1000x1476) |  |  |  |
