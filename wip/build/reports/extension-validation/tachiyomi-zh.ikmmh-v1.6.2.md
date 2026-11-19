# Extension Validation Report

- Extension: tachiyomi-zh.ikmmh-v1.6.2
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
- Source ID: 1793919771803569726
- Source name: 爱看漫
- Source language: zh
- Selected manga input: popular offset 0: -Silent Witch-沉默的魔女的秘密~ (`.../18692`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | -Silent Witch-沉默的魔女的秘密~ (`.../18692`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | 同班同邪~ (`.../70699`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 80 | 网游：神级刺客，我即是暗影 (`.../62332`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 终极战争~ (`.../27781`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | -Silent Witch-沉默的魔女的秘密~ (`.../18692`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | -Silent Witch-沉默的魔女的秘密~ (`.../18692`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 32 | 第00话 (`.../1330371.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=-Silent Witch-沉默的魔女的秘密~, URL=`.../18692` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 195/195 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 195/195 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tuer.justpic01pt.com/.../81c02382-e25c-11eb-b74c-00163e0ca5bd.jpg` (image/jpeg, 25682 bytes, 270x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../18692` |  |  |  |
| details thumbnail URL | PASS | `https://tuer.justpic01pt.com/.../81c02382-e25c-11eb-b74c-00163e0ca5bd.jpg` |  |  |  |
| details author | PASS | 桟とび,依空まつり |  |  |  |
| details artist | PASS | 桟とび,依空まつり |  |  |  |
| details genres | PASS | 轻小说 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 人类不进行咏唱，就无法操控魔力。可是，一名天才少女将这不可能化为了可能。奇迹不需要咏唱——这是一个胆小、软弱，却又是最强的，魔女的故事。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tuer.justpic01pt.com/.../1.jpg` (image/jpeg, 146273 bytes, 800x1130) |  |  |  |
