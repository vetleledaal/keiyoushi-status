# Extension Validation Report

- Extension: tachiyomi-en.azuki-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8195282477201261072
- Source name: Omoi
- Source language: en
- Selected manga input: popular offset 0: Wandance (`.../wandance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Wandance (`.../wandance`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Battle Angel Alita (`.../battle-angel-alita`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Say Hello to Mr. Wallaby! (`.../say-hello-to-mr-wallaby`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | A Man and His Cat (`.../a-man-and-his-cat`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Wandance (`.../wandance`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Wandance (`.../wandance`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 65 | Chapter 1 (`.../1cd85c00-68a7-4adc-b4b1-fa6f4b51d080`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wandance, URL=`wandance#6189869b-5942-498f-89e4-29067cd6f695` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://production.image.azuki.co/.../800_2-3.jpg` (image/jpeg, 171094 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `wandance#6189869b-5942-498f-89e4-29067cd6f695` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://production.image.azuki.co/.../2400_2-3.webp` (image/webp (encoding: lossy), 475676 bytes, 2400x3600) |  |  |  |
| details author | PASS | Coffee |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, School Life, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A boy named Kaboku sees a girl named Wanda dance, and suddenly burns with a need to join in. With its thrilling scenes of Japanese hip-hop dance and quirky, charming characters, this is a new, inspirational manga for fans of coming-of-age stories like Blue Period and Your Lie in April. Get up and join the Wandance! A SHY TEENAGER HAPPENS ON A CLASSMATE DANCING ALONE, AND HER JOY TURNS A KEY, UNLOCKING SOMETHING IN HIS HEART… Kaboku Kotani is starting high school, and he plans to do what he’s always done: go along with his friends, keep quiet, and not to draw too much attention to himself. After all, it’s hard enough to get by with a stutter like his—why make things worse by standing out from the crowd? But then he sees another first-year, Hikari Wanda, dancing like no one is watching—or like she doesn’t care who sees her. It makes Kaboku wonder: Could he reach that same freedom? To find his way to Wanda, he does something he never thought he could: He joins the dance club. After all, every routine begins with a single step, right? Join Kaboku and Wanda as they freestyle their way to life and love!<br><br>Alternative Titles:<br>ワンダンス<br>WonDance |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 65 chapters |  |  |  |
| chapter dates | LINT | 64 of 65 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=64 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://production.image-content.azuki.co/.../1600.webp <redacted query values: drm>` (image/webp (encoding: lossy), 286168 bytes, 1600x2279) |  |  |  |
