# Extension Validation Report

- Extension: tachiyomi-zh.mh1234-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7895725080195720063
- Source name: 漫画1234
- Source language: zh
- Selected manga input: popular offset 0: 我的微信连三界 (`.../13704.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | 我的微信连三界 (`.../13704.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 21 | 大主宰 (`.../13738.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | 受宠姐姐消失的世界 (`.../53279.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 21 | 问题千金改造师 (`.../51730.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | 我的微信连三界 (`.../13704.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 我的微信连三界 (`.../13704.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 554 | 第1话 玉宝宝请求添加好友 (`.../MTM3MDQtNDEzNTc4LTIxYTI1OGRiNTQ`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=我的微信连三界, URL=`.../13704.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wmh1234.wszwhg.net/.../7a9a7cc7f0889ce8df41eca66618.webp <redacted query values: st and e>` (image/webp (encoding: lossy), 91026 bytes, 750x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../13704.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | iCiyuan动漫 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 热血 少年 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【每周三更新】本是普通大学生的林海，在微信更新后，被拉入了天庭的交易群，从此生活变得多姿多彩起来。王母娘娘的面膜用完了？拿十个蟠桃来换，不讲价。太上老君想抽软中华？十颗天地造化丹，概不赊账。红孩儿想喝哇哈哈？三昧真火拿过来，赶紧的。嫦娥想穿情趣内衣？哎呀，这个不好办，容我亲自过去一丈量下尺寸 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 554 chapters |  |  |  |
| chapter dates | LINT | All 554 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=554 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://wmh1234.wszwhg.net/.../20181027183134159.webp <redacted query values: st and e>` (image/webp (encoding: lossy), 107956 bytes, 800x1132) |  |  |  |
