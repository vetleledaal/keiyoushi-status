# Extension Validation Report

- Extension: tachiyomi-en.mangahot-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1536742225206613908
- Source name: MangaHot
- Source language: en
- Selected manga input: popular offset 0: Absolute Threshold (`.../441`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Absolute Threshold (`.../441`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Dragon Ball Super (`.../174`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Friend of the Demon King (`.../432`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Sword God High School: The Talentless Underachiever Becomes the Strongest (`.../899`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Absolute Threshold (`.../absolute-threshold`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Absolute Threshold (`.../441`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 110 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Absolute Threshold, URL=`.../absolute-threshold` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangahot.org/.../absolute-threshold.webp` -> 2 manga URLs (examples: `441`, `.../absolute-threshold`) |  |  |  |
| thumbnail | PASS | `https://mangahot.org/.../absolute-threshold.webp` (image/webp (container: extended), 49568 bytes, 300x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `441` |  |  |  |
| details thumbnail URL | PASS | `https://mangahot.org/.../absolute-threshold.webp` |  |  |  |
| details author | PASS | Gyogyeol |  |  |  |
| details artist | PASS | Bulgama |  |  |  |
| details genres | PASS | Adult, Drama, Josei, Romance, Smut, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Growing up with a mobster father, Joomi never had the luxury of being “normal.” Despite the wealth and constant company surrounding her, she always felt alone, wanting to break free and live an ordinary life. But her hopes are forever shattered when she encounters Jeong Yoongyo, a cold-hearted successor to Korea’s biggest mob clan. Their chance meeting ignites a forbidden romance, leading to a fateful night of passion with grave consequences. Despite all the risks and odds, fate and desire draw them together, forcing them to navigate the perilous waters of their conflicting worlds.<br><br>★★★★★ 5 (1)<br>2023 · Manhwa<br><br>**Associated Name(s):**<br>- The Absolute Threshold<br>- Absolute Station<br>- 절대역 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | LINT | 109 of 110 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=109 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangahot.org/.../0.jpg` (image/jpeg, 3832205 bytes, 720x10990) |  |  |  |
