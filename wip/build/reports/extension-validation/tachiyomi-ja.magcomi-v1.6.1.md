# Extension Validation Report

- Extension: tachiyomi-ja.magcomi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 8643773902904736600
- Source name: MAGCOMI
- Source language: ja
- Selected manga input: popular offset 0: 侯爵嫡男好色物語 ～異世界ハーレム英雄戦記～ (`.../3269754496353303204`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 101 | 侯爵嫡男好色物語 ～異世界ハーレム英雄戦記～ (`.../3269754496353303204`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 101 | 異世界たぬき (`.../2550912965503589788`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 侯爵嫡男好色物語 ～異世界ハーレム英雄戦記～ (`.../3269754496353303204`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 侯爵嫡男好色物語 ～異世界ハーレム英雄戦記～ (`.../3269754496353303204`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | 第1話「クオルデンツェ家の転生者」 (`.../3269754496353303372`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 68 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 101 entries |  |  |  |
| latest listing | PASS | 101 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=侯爵嫡男好色物語 ～異世界ハーレム英雄戦記～, URL=`3269754496353303204` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 203/203 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 203/203 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.magcomi.com/.../3269754496353303204-126997e3f9d994e99f8a89d9c6deea08 <redacted query values: 1788185609>` (image/jpeg, 1228443 bytes, 1320x880) |  |  |  |
| details identity | PASS | Details preserved selected URL `3269754496353303204` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.magcomi.com/.../3269754496353303204-126997e3f9d994e99f8a89d9c6deea08 <redacted query values: 1788185609>` |  |  |  |
| details author | PASS | AL/GEN |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【毎月第3金曜日更新】王国屈指の大貴族に転生した元サラリーマン、美女を求めて戦乱続く大陸を奔走する!「小説家になろう」姉妹サイト、ノクターンノベルズ発大人気ファンタジー戦記、ここに開幕!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.magcomi.com/.../3269754496850470687-0eb665a97fa57771bdd0b6a88a1edc6d` (image/jpeg, 372454 bytes, 1016x1457) |  |  |  |
