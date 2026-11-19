# Extension Validation Report

- Extension: tachiyomi-en.tailspace-v1.6.1
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
- Source ID: 9002977233306000351
- Source name: Tailspace
- Source language: en
- Selected manga input: popular offset 0: Dragon and Dog (`.../Dragon%20and%20Dog`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Dragon and Dog (`.../Dragon%20and%20Dog`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | Passiontail Isle : The Food's On You (`.../Passiontail%20Isle%20:%20The%20Food's%20On%20You`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | ABVR (`.../ABVR`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 60 | TF-Rotica (`.../TF-Rotica`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dragon and Dog (`.../Dragon%20and%20Dog`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dragon and Dog (`.../Dragon%20and%20Dog`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../Dragon%20and%20Dog`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | <1s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dragon and Dog, URL=`Dragon and Dog` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 241/241 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 241/241 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pics.tailspace.com/.../thumbnail-2x.webp <redacted query values: v>` (image/webp (encoding: lossy), 26830 bytes, 320x452) |  |  |  |
| details identity | PASS | Details preserved selected URL `Dragon and Dog` |  |  |  |
| details thumbnail URL | PASS | `https://pics.tailspace.com/.../thumbnail-2x.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Pngx |  |  |  |
| details artist | PASS | Pngx |  |  |  |
| details genres | PASS | Male, Explicit, anal, anthro, canine, canine penis, dragon, knotting, muscular, scalie, presenting, sheath play |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pics.tailspace.com/.../kaECpOmIfkbVgvqdxzPIosIC.jpg` (image/jpeg, 312179 bytes, 1414x1999) |  |  |  |
