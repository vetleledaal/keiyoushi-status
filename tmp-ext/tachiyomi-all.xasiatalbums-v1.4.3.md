# Extension Validation Report

- Extension: tachiyomi-all.xasiatalbums-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7187893778775685546
- Source name: XAsiat Albums
- Source language: all
- Selected manga input: latest offset 0: [NS Eyes] SF-147 - 2002.01.25 - MEGUMI (めぐみ) (`.../ns-eyes-sf-147-2002-01-25-megumi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | [Photobook] 宮下玲奈  NUDE POSE BOOK 増ページ特装版 (`.../photobook-nude-pose-book2`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | [Photobook] 2026.02.03 乃木坂46 梅澤美波 2nd写真集 透明な覚悟 (`.../photobook-2026-02-03-46-2nd`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | [NS Eyes] SF-147 - 2002.01.25 - MEGUMI (めぐみ) (`.../ns-eyes-sf-147-2002-01-25-megumi`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | [NS Eyes] SF-191 Ogawa Marumi 小川まるみ (`.../ns-eyes-sf-191-ogawa-marumi`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | [NS Eyes] SF-147 - 2002.01.25 - MEGUMI (めぐみ) (`.../ns-eyes-sf-147-2002-01-25-megumi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [NS Eyes] SF-147 - 2002.01.25 - MEGUMI (めぐみ) (`.../ns-eyes-sf-147-2002-01-25-megumi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Photobook (`.../ns-eyes-sf-147-2002-01-25-megumi`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[NS Eyes\] SF-147 - 2002.01.25 - MEGUMI (めぐみ), URL=`.../ns-eyes-sf-147-2002-01-25-megumi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pic.xascdn.li/.../preview.jpg` (image/jpeg, 37320 bytes, 380x507) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ns-eyes-sf-147-2002-01-25-megumi` |  |  |  |
| details thumbnail URL | PASS | `https://pic.xascdn.li/.../preview.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects); popular_next: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects); latest: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects); latest_next: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects); search: `https://www.xasiat.com/.../search <redacted query values: mode, function, block_id, from, from_albums, q, and _>` to `https://www.xasiat.com/.../search <redacted query values: mode, function, block_id, from, from_albums, q, and _>` (1 redirects) |  |  |  |
| page load | PASS | `https://www.xasiat.com/.../2612613.jpg <redacted query values: i-acctoken>` (image/jpeg, 212561 bytes, 1280x851) |  |  |  |
