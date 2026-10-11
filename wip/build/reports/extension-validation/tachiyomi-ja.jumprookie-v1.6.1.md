# Extension Validation Report

- Extension: tachiyomi-ja.jumprookie-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 4194563020378281165
- Source name: Jump Rookie!
- Source language: ja
- Selected manga input: popular offset 0: 紅の怪物 (`.../TWpXKpY9p1w`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | 紅の怪物 (`.../TWpXKpY9p1w`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | 武器にしなよ水野っち！ (`.../TWpXKpY9ENQ`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 魔王に世界の半分あげてみた (`.../TWpXKpY_9aM`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | ゆきぐされ４コマ劇場 (`.../TWpXKpYCWc4`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 紅の怪物 (`.../TWpXKpY9p1w`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 紅の怪物 (`.../TWpXKpY9p1w`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 第 1 話 (`.../TWpXKpY9p18`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=紅の怪物, URL=`.../TWpXKpY9p1w` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.rookie.shonenjump.com%2Fpublic%2Fcover_images%2F5578366928872646497-95737c7e1fa5` (image/jpeg, 25480 bytes, 320x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../TWpXKpY9p1w` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-img.rookie.shonenjump.com/.../5578366928872646497-95737c7e1fa5` (image/jpeg, 61324 bytes, 640x640) |  |  |  |
| details author | PASS | ロストマン 作 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, バトル |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 紅い雨が降った日、町は殺人鬼だらけと化した。甘えん坊のボウは、この境遇を生き抜く為、人を守る為、強くなろうとするが…(この漫画はフィクションです) 以前描いていた「殺意の咆哮」のリメイクです。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.rookie.shonenjump.com/.../5578366928872645204-2f5e210a78ca` (image/jpeg, 576019 bytes, 1200x1699) |  |  |  |
