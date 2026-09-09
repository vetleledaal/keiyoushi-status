# Extension Validation Report

- Extension: tachiyomi-en.hentaihere-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7266624490370375187
- Source name: HentaiHere
- Source language: en
- Selected manga input: latest offset 0: Dekigokoro de Hajimeta Shokushu Onanie ga Kimochi Yosugite Tomeraremasen! (`.../S72045`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | The Case Of A Gloomy Girl Who Became My Fuckbuddy After I Raped Her (`.../S58122`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Kyousei No Hanayome ~Kegareta Chouritsu~ (`.../S60528`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | Dekigokoro de Hajimeta Shokushu Onanie ga Kimochi Yosugite Tomeraremasen! (`.../S72045`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | COSMIC DARK AUCTION (`.../S72006`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 40 | Dekigokoro de Hajimeta Shokushu Onanie ga Kimochi Yosugite Tomeraremasen! (`.../S72045`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Dekigokoro de Hajimeta Shokushu Onanie ga Kimochi Yosugite Tomeraremasen! (`.../S72045`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 1 - Dekigokoro de Hajimeta Shokushu Onanie ga Kimochi Yosugite Tomeraremasen! [Oneshot] (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dekigokoro de Hajimeta Shokushu Onanie ga Kimochi Yosugite Tomeraremasen!, URL=`.../S72045` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Booty Heroes, URL=`.../pdTBmb` at page 1 offset 34 and page 2 offset 22 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Harem Heroes, URL=`.../pdTBmb` at page 1 offset 16 and page 2 offset 12 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 200/200 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 200/200 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaicdn.com/.../_S72045.jpg` (image/jpeg, 46005 bytes, 400x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../S72045` |  |  |  |
| details thumbnail URL | PASS | `https://hentaicdn.com/.../_S72045.jpg` |  |  |  |
| details author | PASS | Unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Oneshot, Ahegao, Bondage, Cervix Penetration, Creampie, Masturbation, Monster Sex, Monsters, Partial Censorship, School Girls, Small Breasts, Squirting, Tentacles, X-Ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaicdn.com/.../ccdn0001.jpg` (image/jpeg, 261176 bytes, 1075x1518) |  |  |  |
