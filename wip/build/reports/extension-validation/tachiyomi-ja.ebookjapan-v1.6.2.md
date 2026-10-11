# Extension Validation Report

- Extension: tachiyomi-ja.ebookjapan-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: RETRY_WHEN
- Retry condition: HARNESS_REVISION_CHANGES: java.lang.NoSuchMethodError

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 124967435702149192
- Source name: eBookJapan
- Source language: ja
- Selected manga input: popular offset 0: 転生した大聖女は、聖女であることをひた隠す　A Tale of The Great Saint (`.../585667`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 転生した大聖女は、聖女であることをひた隠す　A Tale of The Great Saint (`.../585667`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | 魔男のイチ (`.../872163`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | このご時世に家庭教師【分冊版】 (`.../880845`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 代紋＜エンブレム＞TAKE2【極！分冊シリーズ】 (`.../976255`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 転生した大聖女は、聖女であることをひた隠す　A Tale of The Great Saint (`.../585667`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 転生した大聖女は、聖女であることをひた隠す　A Tale of The Great Saint (`.../585667`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 156 | 転生した大聖女は、聖女であることをひた隠す　A Tale of The Great Saint１ (`.../B00167101184`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 200 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=転生した大聖女は、聖女であることをひた隠す　A Tale of The Great Saint, URL=`585667` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=代紋＜エンブレム＞TAKE2【極！分冊シリーズ】, URL=`976255` at page 1 offsets 48, 49 and page 2 offsets 0, 1, 2, 3, 4, 5, 6, 7 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 2 manga entries: title=このご時世に家庭教師【分冊版】, URL=`880845`, title=代紋＜エンブレム＞TAKE2【極！分冊シリーズ】, URL=`976255`; Latest page 2 repeats 8 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cache2-ebookjapan.akamaized.net/.../O2100539772161.jpg` (image/jpeg, 164133 bytes, 844x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `585667` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cache2-ebookjapan.akamaized.net/.../O2100539772161.jpg <redacted query values: 1791451018000>` (image/jpeg, 164133 bytes, 844x1200) |  |  |  |
| details author | PASS | 青辺マヒト |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 小説家になろう, 令嬢ロマンス, ファンタジー, コミカライズ, 異世界転生・召喚, 聖女, 特殊能力, バトル・アクション, 冒険 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 無才と言われた少女が手にしたのは、規格外のチート能力でした。「剣の才能がない」と言われていた騎士家の少女・フィーア。彼女は死にかかった際、規格外のチート能力を持つ「大聖女」だった前世を思い出し、最強の魔物・黒竜を従魔にする。しかし前世で「聖女として生まれ変わったら殺す」と魔王の右腕に脅されたことを思い出した彼女は、大聖女の力を隠しながら、騎士を目指すが数々の騒動を巻き起こすことに!?<br><br>Publisher: アース・スター エンターテイメント |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 156 chapters |  |  |  |
| chapter dates | PASS | 156 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 200 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://prod-contents-br-page.akamaized.net/.../7664753a3121e63b1cef8c7f8d1cce5b610b6d91586b9779486da59fdcbba62b.webp` could not be downloaded: java.lang.NoSuchMethodError: 'float android.graphics.Rect.exactCenterY()' | RETRY_WHEN | HARNESS_COMPATIBILITY_FAILURE | HARNESS_REVISION_CHANGES: java.lang.NoSuchMethodError |
