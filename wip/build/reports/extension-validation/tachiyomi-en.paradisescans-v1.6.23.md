# Extension Validation Report

- Extension: tachiyomi-en.paradisescans-v1.6.23
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
- Source ID: 5928300995303689257
- Source name: Paradise Scans
- Source language: en
- Selected manga input: popular offset 0: The General secret crush (`.../the-general-s-secret-crush`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | The General secret crush (`.../the-general-s-secret-crush`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Low-Temperature Burn (`.../low-temperature-burn`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | All About Your Love (`.../all_about_your_love`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Love Upset (`.../love-upset`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The General secret crush (`.../the-general-s-secret-crush`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The General secret crush (`.../the-general-s-secret-crush`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The General secret crush, URL=`.../the-general-s-secret-crush` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://paradisescans.com/.../2eb36dd0-2e00-4621-9622-ee33460e0f1b.webp` (image/webp (encoding: lossy), 307442 bytes, 960x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-general-s-secret-crush` |  |  |  |
| details thumbnail URL | PASS | `https://paradisescans.com/.../2eb36dd0-2e00-4621-9622-ee33460e0f1b.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Danyeong's meticulously guarded control shatters one fateful night. A treacherous friend drugs him, blinds him, and delivers him straight into the Crown Prince's private bedchamber.What follows is a passionate encounter born of confusion and coercion. The naive Prince and the disciplined General are suddenly locked in a bewildering entanglement that strips Danyeong of his reputation and exposes the raw intensity of their connection.Will Danyeong pay the ultimate price for one night of unintended ecstasy, or will this dangerous secret finally force their forbidden love into the light? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://paradisescans.com/.../p-0001.jpg` (image/jpeg, 1087627 bytes, 800x15727) |  |  |  |
