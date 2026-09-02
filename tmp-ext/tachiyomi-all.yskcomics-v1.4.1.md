# Extension Validation Report

- Extension: tachiyomi-all.yskcomics-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 177448809266948921
- Source name: YSK Comics
- Source language: en
- Selected manga input: latest offset 0: American Caper (2025) (`.../american-caper-2025`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Ghost Pepper (2025) (`.../ghost-pepper-2025`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | American Caper (2025) (`.../american-caper-2025`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Ghost Pepper (2025) (`.../ghost-pepper-2025`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | American Caper (2025) (`.../american-caper-2025`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | American Caper (2025) (`.../american-caper-2025`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 7 | #1 (`.../american-caper-2025-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=American Caper (2025), URL=`.../american-caper-2025` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ysk-comics.com/.../TOyM9JuOSQJqGk7A.webp` (image/webp (encoding: lossy), 33394 bytes, 390x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../american-caper-2025` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.ysk-comics.com/.../TOyM9JuOSQJqGk7A.webp` |  |  |  |
| details author | PASS | Dan Houser |  |  |  |
| details artist | PASS | Chris Anderson, David Lapham, Lee Loughridge |  |  |  |
| details genres | PASS | Crime, action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Publisher: Dark Horse Comics<br>Published at: 2026-05-23<br><br>American Caper is a 2025 crime-fiction comic series published by Dark Horse Comics in partnership with Absurd Ventures. Created and written by Dan Houser, with Lazlow producing and contributing additional writing, the series features story layouts and pencils by David Lapham, finishes by Chris Anderson, colors by Lee Loughridge, and lettering by Nate Piekos. The series was announced as a 12-issue crime satire, with issue #1 released in November 2025.<br><br>American Caper by Dark Horse is a wild, bitter, and darkly funny look at modern American collapse. The story follows two “totally normal” but deeply damaged families caught in a world of corrupt businesses, useless local politicians, clumsy criminals, fake morality, and truly unfortunate leisurewear. At the center are two neighbors standing on the edge of disaster: a Mormon hit man and a gambling-addict lawyer, whose lives become tangled in a real-estate deal gone horribly wrong.<br><br>The comic’s world is packed with strange, dangerous, and unforgettable characters. There is a Mexican beauty queen running from her past, two escaped convicts in love, a Wall Street billionaire who has reinvented himself as a cowboy, and a revenge-driven maniac ready to burn everything down. Together, they form a chaotic portrait of a country where every problem is someone else’s fault and every scam comes wrapped in patriotism, ambition, or self-righteousness.<br><br>For readers searching for a Dan Houser comic, Lazlow comic book, or Dark Horse crime comic, American Caper is especially appealing. Houser and Lazlow are widely known for their work connected to Grand Theft Auto and Red Dead Redemption, and that satirical edge carries into this series. The comic takes aim at real estate obsession, political theater, wealth worship, cultural division, and violence sold as entertainment. It feels sharp, loud, and intentionally uncomfortable.<br><br>The setting moves through several symbolic parts of America, from the manicured tax-avoiding wilderness of Wyoming to liberal Brooklyn and the confused political battlegrounds of Florida. Absurd Ventures describes the series as a crime-fiction saga about American life dominated by “real estate, violence and snake oil,” making it a strong fit for fans of modern noir, black comedy, and social satire. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | LINT | All 7 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=7 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.ysk-comics.com/.../1.jpg` (image/jpeg, 3995389 bytes, 3816x5868) |  |  |  |
