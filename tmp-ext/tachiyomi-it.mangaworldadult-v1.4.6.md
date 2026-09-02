# Extension Validation Report

- Extension: tachiyomi-it.mangaworldadult-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 392961957042768607
- Source name: MangaworldAdult
- Source language: it
- Selected manga input: popular offset 0: Sextudy Group (`.../sextudy-group`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Sextudy Group (`.../sextudy-group`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 16 | A Pervert's Daily Life (`.../a-pervert-s-daily-life`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Love:Zero (`.../love-zero`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Dating After Work (`.../dating-after-work`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Sextudy Group (`.../sextudy-group`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sextudy Group (`.../sextudy-group`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 111 | Capitolo 01 (`.../64666d66ef873266f0b38b13 <redacted query values: style>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sextudy Group, URL=`.../sextudy-group` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaworld.mx/.../623b83d1cb9ba8644a144a67.jpg <redacted query values: 1788356894284>` (image/jpeg, 75399 bytes, 460x690) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sextudy-group` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.mangaworld.mx/.../623b83d1cb9ba8644a144a67.jpg <redacted query values: 1788351550736>` (image/jpeg, 75399 bytes, 460x690) |  |  |  |
| details author | PASS | Abio4 |  |  |  |
| details artist | PASS | 뱅끼 |  |  |  |
| details genres | PASS | Adulti, Maturo, Romantico, Scolastico, Seinen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ho iniziato a studiare per avvicinarmi al mio senior preferito. Sextudy? Inizia una "classe speciale" per Huyn-ho, un nuovo studente universitario. "Dai, tieni la vita. Lo infilo qui dentro, capito?"<br><br>Titoli alternativi: 深度交流會, 섹터디그룹, Sex Study Group |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 111 chapters |  |  |  |
| chapter dates | PASS | 111 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.mangaworld.mx/.../1.png` (image/png, 564295 bytes, 720x1350) |  |  |  |
