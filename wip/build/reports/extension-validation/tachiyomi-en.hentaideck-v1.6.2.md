# Extension Validation Report

- Extension: tachiyomi-en.hentaideck-v1.6.2
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
- Source theme: mangathemesia
- Source ID: 3060711657360263651
- Source name: HentaiDeck
- Source language: en
- Selected manga input: popular offset 0: Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Traditional Job of Washing Girls’ Body (`.../traditional-job-of-washing-girls-body`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Secret Class (`.../secret-class`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Master of the Island (`.../master-of-the-island`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 82 | Chapter 1 (`.../someone-stop-her-uncensored-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Someone Stop Her! (Uncensored), URL=`.../someone-stop-her-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaideck.com/.../someone-stop-her-uncensored-193x278.jpg` (image/jpeg, 10937 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../someone-stop-her-uncensored` |  |  |  |
| details thumbnail URL | PASS | `https://hentaideck.com/.../someone-stop-her-uncensored-193x278.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | To regain his peace, Gangchan must welcome his blood-curdling, smoking neighbor and her housemates into his home. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | PASS | 82 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.hentai1.io/.../001.jpg` (image/webp (encoding: lossy), 171924 bytes, 720x5000; server Content-Type: image/jpeg) |  |  |  |
