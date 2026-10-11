# Extension Validation Report

- Extension: tachiyomi-ja.jmanga-v1.6.10
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangareader
- Source ID: 6141590427749684419
- Source name: Jmanga
- Source language: ja
- Selected manga input: popular offset 0: 囚人リク (`.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | 囚人リク (`.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 35 | ダイヤのa (`.../%E3%83%80%E3%82%A4%E3%83%A4%E3%81%AEa-raw`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 35 | いきもにあっく! (`.../%E3%81%84%E3%81%8D%E3%82%82%E3%81%AB%E3%81%82%E3%81%A3%E3%81%8F-raw`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 35 | 完璧すぎて可愛げがないと婚約破棄された聖女は隣国に売られる (`.../%E5%AE%8C%E7%92%A7%E3%81%99%E3%81%8E%E3%81%A6%E5%8F%AF%E6%84%9B%E3%81%92%E3%81%8C%E3%81%AA%E3%81%84%E3%81%A8%E5%A9%9A%E7%B4%84%E7%A0%B4%E6%A3%84%E3%81%95%E3%82%8C%E3%81%9F%E8%81%96%E5%A5%B3%E3%81%AF%E9%9A%A3%E5%9B%BD%E3%81%AB%E5%A3%B2%E3%82%89%E3%82%8C%E3%82%8B-raw`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 囚人リク (`.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 囚人リク (`.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 324 | 第1話: 囚人リク (Raw – Free) 【第1話】 (`.../chapter-1-raw`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=囚人リク, URL=`.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgoimg.view47.com/.../fa18279c48ba744a3491453a26579a2c.jpeg` (image/jpeg, 32338 bytes, 300x463) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mgoimg.view47.com/.../fa18279c48ba744a3491453a26579a2c.jpeg` was not downloaded |  |  |  |
| details author | PASS | 瀬口忍 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | バトル・アクション, ヒューマンドラマ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 囚人リク raw,囚人リク zip,囚人リク manga 隕石直撃による首都壊滅から10年。近未来都市“東京”のスラム街で貧しくともたくましく生きる栗田陸・13歳が、ある犯罪に巻き込まれ、最果ての監獄へ…!!無実の罪で懲役30年を科せられた少年の破獄バトル!!<br><br>Alternative Title: 囚人リク(SHUUJIN RIKU Raw)しゅうじんりく |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 324 chapters |  |  |  |
| chapter dates | LINT | All 324 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=324 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://jmanga.cyou/.../filter <redacted query values: sort and p>` to `https://jmanga.media/.../filter <redacted query values: sort and p>` (1 redirects); popular: `https://jmanga.cyou/.../filter <redacted query values: sort and p>` to `https://jmanga.media/.../filter <redacted query values: sort and p>` (1 redirects); popular: `https://jmanga.cyou/.../filter <redacted query values: sort and p>` to `https://jmanga.media/.../filter <redacted query values: sort and p>` (1 redirects); popular: `https://jmanga.cyou/.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw` to `https://jmanga.media/.../%E5%9B%9A%E4%BA%BA%E3%83%AA%E3%82%AF-raw` (1 redirects); popular: `https://jmanga.cyou <redacted query values: q and p>` to `https://jmanga.media <redacted query values: q and p>` (1 redirects); popular: `https://jmanga.cyou/.../chapter <redacted query values: mode and id>` to `https://jmanga.media/.../chapter <redacted query values: mode and id>` (1 redirects); popular: `https://jmanga.cyou/.../filter <redacted query values: sort and p>` to `https://jmanga.media/.../filter <redacted query values: sort and p>` (1 redirects) |  |  |  |
| page load | PASS | `https://sv1.freeimgmg.online/.../1.webp` (image/webp (encoding: lossy), 315670 bytes, 981x1600) |  |  |  |
