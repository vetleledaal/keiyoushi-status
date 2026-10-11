# Extension Validation Report

- Extension: tachiyomi-en.stonescape-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5914422711950728870
- Source name: StoneScape
- Source language: en
- Selected manga input: popular offset 0: Plaything (`.../plaything`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Plaything (`.../plaything`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Got Dropped Into a Ghost Story, Still Gotta Work (`.../ghost-story-work`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Ghost Story Club (`.../ghost-story-club`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Plaything (`.../plaything`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Plaything (`.../plaything`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 80 | Chapter 1 (`.../ch-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Plaything, URL=`.../plaything` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stonescape.xyz/.../dfccc982-dc11-404f-ac74-2409438bfe4d.gif` (image/gif (format: 89a), 10325417 bytes, 480x638) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../plaything` |  |  |  |
| details thumbnail URL | PASS | `https://stonescape.xyz/.../dfccc982-dc11-404f-ac74-2409438bfe4d.gif` |  |  |  |
| details author | PASS | Q-Boy |  |  |  |
| details artist | PASS | Q-Boy |  |  |  |
| details genres | PASS | Action, Comedy, Seinen, Psychological, Tragedy, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lee Myung-jun, the Vice Chairman of Hyundo Group, lost his daughter to a group of bullies. Seeking revenge, he adopts Yoon Karma, a psychopathic defector girl.<br><br>Yoon Karma: A sadistic human weapon created through drug experiments in North Korea. After killing everyone in the research lab, she escaped to South Korea on her own.<br><br>Having just been released from a juvenile detention center in South Korea, Yoon Karma sets out to hunt down the bullies at school, driven by the desire to avenge her new father and satisfy her sadistic pleasures. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://stonescape.xyz/.../7ce1a46c-507e-42f9-93c7-197138a3f680.webp` (image/webp (encoding: lossless), 486646 bytes, 690x1259) |  |  |  |
