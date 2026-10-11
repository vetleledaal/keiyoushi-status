# Extension Validation Report

- Extension: tachiyomi-en.kodansha-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Attack on Titan (`.../e21f6d90-e6ab-4bac-8990-86fd7c15de25`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Attack on Titan (`.../e21f6d90-e6ab-4bac-8990-86fd7c15de25`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Run Away With Me, Girl (`.../dae11c8b-86d3-4848-a80d-fb98df5cf717`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Blue Lock Full Color Selection (`.../4d865cab-748b-4480-944a-184cb3d9edff`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Chi's Sweet France (`.../c3065946-6210-4ff1-8a3a-7818e1b7f5e2`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Attack on Titan (`.../e21f6d90-e6ab-4bac-8990-86fd7c15de25`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Attack on Titan (`.../e21f6d90-e6ab-4bac-8990-86fd7c15de25`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 142 | Vol. 1 Ch. 1 (`.../2624675d-340c-4fbb-9ac2-12a802832c8c`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 56 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Attack on Titan, URL=`e21f6d90-e6ab-4bac-8990-86fd7c15de25` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://production.image.azuki.co/.../800_2-3.webp` (image/webp (encoding: lossy), 432126 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `e21f6d90-e6ab-4bac-8990-86fd7c15de25` |  |  |  |
| details thumbnail URL | PASS | `https://production.image.azuki.co/.../800_2-3.webp` |  |  |  |
| details author | PASS | Hajime Isayama |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Made into Anime, Horror, Science-Fiction |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | A century ago, the grotesque giants known as Titans appeared and consumed all but a few thousand humans. The survivors took refuge behind giant walls. Today, the threat of the Titans is a distant memory, and a boy named Eren yearns to explore the world beyond Wall Maria. But what began as a childish dream will become an all-too-real nightmare when the Titans return and humanity is once again on the brink of extinction… Attack on Titan is the award-winning and New York Times-bestselling series that is the manga hit of the decade! Spawning the monster hit anime TV series of the same name, Attack on Titan has become a pop culture sensation.<br><br>Alternative Titles:<br>進撃の巨人 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 142 chapters |  |  |  |
| chapter dates | LINT | 139 of 142 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=139 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://production.image-content.azuki.co/.../1600.webp` (image/webp (encoding: lossy), 384936 bytes, 1600x2400) |  |  |  |
