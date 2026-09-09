# Extension Validation Report

- Extension: tachiyomi-en.ohjoysextoy-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 3
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4502591927177845825
- Source name: Oh Joy Sex Toy
- Source language: en
- Selected manga input: latest offset 0: Way Of The Sauna (`.../way-of-the-sauna-hien-pham`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 84 | Way Of The Sauna (`.../way-of-the-sauna-hien-pham`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 84 | All About Gags (`.../all-about-gags-elisa2b`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 4 | Way Of The Sauna (`.../way-of-the-sauna-hien-pham`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 84 | Way Of The Sauna (`.../way-of-the-sauna-hien-pham`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Way Of The Sauna (`.../way-of-the-sauna-hien-pham`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Oh Joy Sex Toy - Way Of The Sauna by Hien Pham (`.../way-of-the-sauna-hien-pham`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 84 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Way Of The Sauna, URL=`.../way-of-the-sauna-hien-pham` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 256/256 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 172/256 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ohjoysextoy.com/.../Sauna__OJST_preview-sm.jpg` (image/jpeg, 43221 bytes, 396x396) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../way-of-the-sauna-hien-pham` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.ohjoysextoy.com/.../Sauna__twitter.jpg` (image/jpeg, 131306 bytes, 1200x630) |  |  |  |
| details author | PASS | Hien Pham |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adventures, Comic, Education Comics, Favorites, Hien Pham, How To, Interviews, Non-Fiction Comics, Shareable Comics, Transcribed |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Text: Oh Joy Sex Toy presents Way of the Sauna by Hien Pham<br>Image: Purple-pink illustration of men in a steamy sauna....<br><br>Portfolio: https://hiencomics.com.au<br>Bluesky: https://bsky.app/.../hiencomics.com.au<br>Instagram: https://www.instagram.com/.../hiencomics<br>Patreon: https://www.patreon.com/.../hiencomics<br>Here on OJST!: https://www.ohjoysextoy.com/.../hienpham<br><br>(Full description and credits in WebView) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.ohjoysextoy.com/.../1` to `https://www.ohjoysextoy.com/.../comic` (1 redirects) |  |  |  |
| page load | PASS | `https://www.ohjoysextoy.com/.../2026-09-08-Way-Of-The-Sauna-Hien-Pham-1.jpg` (image/jpeg, 831762 bytes, 1536x2812) |  |  |  |
