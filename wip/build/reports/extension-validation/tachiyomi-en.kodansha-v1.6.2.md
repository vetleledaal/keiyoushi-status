# Extension Validation Report

- Extension: tachiyomi-en.kodansha-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8879500923091081231
- Source name: Kodansha
- Source language: en
- Selected manga input: popular offset 0: Blue Lock (`.../e372cc58-11db-4883-b87a-38392c73a87d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Blue Lock (`.../e372cc58-11db-4883-b87a-38392c73a87d`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Grand Blue Dreaming (`.../51db466b-ca5d-4866-9954-10789d4553a9`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | A Sign of Affection Chapters (`.../5e154bee-8632-4898-97aa-4c9ab77ead11`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | WICKED SPOT (`.../13568916-c0e4-4fa0-a1c2-2c63b9ba09f8`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Blue Lock (`.../e372cc58-11db-4883-b87a-38392c73a87d`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`.../e372cc58-11db-4883-b87a-38392c73a87d`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 377 | Vol. 1 Ch. 1 (`.../ea365e2d-8abb-40f3-9c4f-5b281bc5817d`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 86 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`e372cc58-11db-4883-b87a-38392c73a87d` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://production.image.azuki.co/.../800_2-3.webp` (image/webp (encoding: lossy), 161788 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `e372cc58-11db-4883-b87a-38392c73a87d` |  |  |  |
| details thumbnail URL | PASS | `https://production.image.azuki.co/.../800_2-3.webp` |  |  |  |
| details author | PASS | Muneyuki Kaneshiro, Yusuke Nomura |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Made into Anime, Sports, Thriller |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After a disastrous defeat at the 2018 World Cup, Japan’s team struggles to regroup. But what’s missing? An absolute Ace Striker, who can guide them to the win. The Japan Football Union is hell-bent on creating a striker who hungers for goals and thirsts for victory, and who can be the decisive instrument in turning around a losing match...and to do so, they’ve gathered 300 of Japan’s best and brightest youth players. Who will emerge to lead the team...and will they be able to out-muscle and out-ego everyone who stands in their way?<br><br>Alternative Titles:<br>ブルーロック |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 377 chapters |  |  |  |
| chapter dates | LINT | 374 of 377 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=374 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 86 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://production.image-content.azuki.co/.../1600.webp` (image/webp (encoding: lossy), 196338 bytes, 1600x2280) |  |  |  |
