# Extension Validation Report

- Extension: tachiyomi-zh.dm5-v1.6.2
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
- Source ID: 293789630396851172
- Source name: 动漫屋
- Source language: zh
- Selected manga input: popular offset 0: 落魄的哥哥其实是最强的 (`.../manhua-luobodegegeqishishizuiqiangde`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 70 | 落魄的哥哥其实是最强的 (`.../manhua-luobodegegeqishishizuiqiangde`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 70 | 药屋少女的呢喃 (`.../manhua-yaowushaonvdenenan`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 70 | 神明妻子的悠闲日常 (`.../manhua-shenmingqizideyouxianrichang`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 70 | 空霸 (`.../manhua-kongba`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 22 | 落魄的哥哥其实是最强的 (`.../manhua-luobodegegeqishishizuiqiangde`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 落魄的哥哥其实是最强的 (`.../manhua-luobodegegeqishishizuiqiangde`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 104 | 第1话 试看 （52P） (`.../m1839796`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 70 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=落魄的哥哥其实是最强的, URL=`.../manhua-luobodegegeqishishizuiqiangde` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 302/302 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 302/302 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhfm6us.cdndm5.com/.../20261003090733_180x240_25.jpg` (image/jpeg, 127140 bytes, 450x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manhua-luobodegegeqishishizuiqiangde` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mhfm3us.cdndm5.com/.../20261003090733_450x600_124.jpg` was not downloaded |  |  |  |
| details author | PASS | あるてら |  |  |  |
| details artist | PASS | あるてら |  |  |  |
| details genres | PASS | 恋爱 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 勇者尤金在与魔王的殊死搏斗後，被强制转生到了遥远的未来。化身为名为「尤利乌斯」的少年後，尤金成了被双胞胎弟弟盖亚斯以及周围人嘲笑的「差生」。然而，重新找回前世自我与强大力量的尤利乌斯，在不知不觉间开始所向披靡……！！ 「史上最强勇者死後转生到魔法衰退的未来学园，被当成废柴哥哥，却毫无自觉地一路无双双」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 104 chapters |  |  |  |
| chapter dates | LINT | All 104 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=104 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhua1041zjcdn26.cdndm5.com/.../1_6576.jpg <redacted query values: cid and key>` (image/jpeg, 155380 bytes, 650x933) |  |  |  |
