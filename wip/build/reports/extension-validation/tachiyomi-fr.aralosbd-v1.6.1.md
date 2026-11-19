# Extension Validation Report

- Extension: tachiyomi-fr.aralosbd-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 3
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
- Selected manga input: latest offset 0: Akuma No Uta (`https://aralosbd.fr/.../display <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | GhostBlade (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Project SHaDe (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Akuma No Uta (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Cross Island (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Akuma No Uta (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Akuma No Uta (`https://aralosbd.fr/.../display <redacted query values: id>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 1 - le premier chapitre (`https://aralosbd.fr/.../chapter <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Akuma No Uta, URL=`https://aralosbd.fr/.../display <redacted query values: id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 97/97 listing manga have titles and URLs; popular: all absolute; popular_next: all absolute; latest: all absolute; latest_next: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://aralosbd.fr/.../display <redacted query values: id>`, popular entry 2: `https://aralosbd.fr/.../display <redacted query values: id>`, popular entry 3: `https://aralosbd.fr/.../display <redacted query values: id>` |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aralosbd.fr/.../2808 <redacted query values: c>` (image/jpeg, 33457 bytes, 358x500; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://aralosbd.fr/.../display <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://aralosbd.fr/.../2808 <redacted query values: c>` |  |  |  |
| details author | PASS | Axo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Nous sommes le 30 octobre 2023. Cidney, notre protagoniste, est hospitalisée en raison d'une maladie incurable. Alors qu'elle sombre dans la dépression, elle reçoit la visite de deux divinités : Kami, le dieu de la mort, et Chronos. Kami lui propose de devenir son élève. Elle ignore encore qu'accepter ce pacte n'est que le début d'une longue histoire…<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>☠︎♏︎ ◻︎❒︎◻︎⧫︎♏︎⌘︎ ◻︎♋︎⬧︎ ♋︎⧫︎⧫︎♏︎■︎⧫︎♓︎□︎■︎ ◻︎ ❍︎□︎■︎ □︎❍︎♌︎❒︎♏︎📪︎ 🙰♏︎ ■︎♏︎ ⬧︎◆︎♓︎⬧︎ ❑︎◆︎♏︎ ☹︎□︎🙵♓︎ ●︎♏︎ 💣︎♋︎♑︎■︎♓︎♐︎♓︎❑︎◆︎♏︎📬︎ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 5 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://aralosbd.fr/.../0 <redacted query values: c>` (image/png, 312729 bytes, 800x1099) |  |  |  |
