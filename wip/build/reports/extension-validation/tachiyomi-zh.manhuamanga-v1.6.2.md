# Extension Validation Report

- Extension: tachiyomi-zh.manhuamanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mccms
- Source ID: 325122966187249774
- Source name: 漫画manga
- Source language: zh
- Selected manga input: popular offset 0: 一人之下 (`.../comic_yirenzhixia.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 一人之下 (`.../comic_yirenzhixia.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 白芷医仙 (`.../comic_baizhiyixian.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 罗斯玛丽的苏醒 (`.../comic_luosimalidesuxing.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 禁锢之日 (`.../comic_jinguzhiri.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 一人之下 (`.../comic_yirenzhixia.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 一人之下 (`.../comic_yirenzhixia.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 800 | 第1话 1.姐姐1 (`.../chapter_13871_4992.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=一人之下, URL=`.../comic_yirenzhixia.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comic.5um.net/.../yirenzhixia.webp` (image/jpeg, 100776 bytes, 600x800; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../comic_yirenzhixia.html` |  |  |  |
| details thumbnail URL | PASS | `https://comic.5um.net/.../yirenzhixia.webp` |  |  |  |
| details author | PASS | 米橙子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 热血, 玄幻, 搞笑, 战斗, 爆笑, 格斗, 冒险 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 9.9<br><br>大学生张楚岚清明回乡，遭遇神秘少女冯宝宝。素未谋面的冯宝宝却对张楚岚异常熟悉，并将其带去自己打工的快递公司。为了帮冯宝宝寻找她的身世，也为了查清自己与爷爷身上的秘密，张楚岚的生活被彻底颠覆，与冯宝宝一同踏上"异人"之旅。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 800 chapters |  |  |  |
| chapter dates | LINT | All 800 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=800 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://manhua.5um.net/.../a81ede2a833bbdf293eb01757d97a8f6.webp` did not contain a decodable image (12160 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
