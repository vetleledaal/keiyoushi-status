# Extension Validation Report

- Extension: tachiyomi-en.azuki-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8195282477201261072
- Source name: Omoi
- Source language: en
- Selected manga input: popular offset 0: The Moon on a Rainy Night (`.../the-moon-on-a-rainy-night`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | The Moon on a Rainy Night (`.../the-moon-on-a-rainy-night`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Nina the Starry Bride (`.../nina-the-starry-bride`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Kamen Rider Kuuga (`.../kamen-rider-kuuga`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Victoria's Electric Coffin (`.../victorias-electric-coffin`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Moon on a Rainy Night (`.../the-moon-on-a-rainy-night`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Moon on a Rainy Night (`.../the-moon-on-a-rainy-night`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 36 | Chapter 1 (`.../980c9491-ede4-49fc-9360-177317c5652f`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 66 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Moon on a Rainy Night, URL=`the-moon-on-a-rainy-night#872a47cf-20f8-43be-9670-69826e138bc6` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://production.image.azuki.co/.../800_2-3.jpg` (image/jpeg, 175469 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-moon-on-a-rainy-night#872a47cf-20f8-43be-9670-69826e138bc6` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://production.image.azuki.co/.../2400_2-3.webp` (image/webp (encoding: lossy), 532150 bytes, 2400x3600) |  |  |  |
| details author | PASS | Kuzushiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, GL/Yuri, LGBTQ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A high school girl’s chance encounter with an enigmatic female classmate whose musical aspirations were complicated when an accident almost completely took her hearing leads to the slow blossoming of love. Perfect for fans of yuri series like Whisper Me a Love Song and sweet, sophisticated romances like A Sign of Affection. One rainy night, Saki is rushing to a piano lesson when she crashes into a beautiful, long-haired girl, dropping her sheet music in the process. Saki stutters an apology, but the girl simply hands back her sheet music and leaves without a word. Saki begins her first day of high school the following morning, only to find the stranger from the night before sitting at the desk next to hers. She learns that the girl’s name is Kanon and that she is not quite completely deaf, but very hard of hearing. Though Kanon needs to be close to people to read their lips, she tends to push people away with her icy demeanor. Through one kind gesture, Saki slowly begins breaking down the walls around Kanon, even as she feels something new blossoming within her.<br><br>Alternative Titles:<br>雨夜の月 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | LINT | 35 of 36 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=35 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://production.image-content.azuki.co/.../1600.webp <redacted query values: drm>` (image/webp (encoding: lossy), 320748 bytes, 1600x2279) |  |  |  |
