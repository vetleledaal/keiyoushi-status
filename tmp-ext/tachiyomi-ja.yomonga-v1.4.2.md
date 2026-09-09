# Extension Validation Report

- Extension: tachiyomi-ja.yomonga-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7561635982432447429
- Source name: Yomonga
- Source language: ja
- Selected manga input: popular offset 0: ソロ女子ですが冷徹上司から溺愛フラグが立っています…⁉ (`.../2560 <redacted query values: episode and cid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | ソロ女子ですが冷徹上司から溺愛フラグが立っています…⁉ (`.../2560 <redacted query values: episode and cid>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | 35歳の不・純愛 ～あなたが恋しいだけだった～ (`.../1933 <redacted query values: episode and cid>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ソロ女子ですが冷徹上司から溺愛フラグが立っています…⁉ (`.../2560 <redacted query values: episode and cid>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ソロ女子ですが冷徹上司から溺愛フラグが立っています…⁉ (`.../2560 <redacted query values: episode and cid>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter.1_1巻 第1話-1 (`.../2560 <redacted query values: episode and cid>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ソロ女子ですが冷徹上司から溺愛フラグが立っています…⁉, URL=`.../2560 <redacted query values: episode and cid>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.yomonga.com/.../%E6%9B%B8%E5%BD%B1%E3%82%B5%E3%83%A0%E3%83%8D%E3%82%A4%E3%83%AB_%E6%96%B0%E5%88%8A_%E3%82%BD%E3%83%AD%E5%A5%B3%E5%AD%90%E3%81%A7%E3%81%99%E3%81%8C.png <redacted query values: v>` (image/png, 244030 bytes, 640x908) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2560 <redacted query values: episode and cid>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.yomonga.com/.../%E6%9B%B8%E5%BD%B1%E3%82%B5%E3%83%A0%E3%83%8D%E3%82%A4%E3%83%AB_%E6%96%B0%E5%88%8A_%E3%82%BD%E3%83%AD%E5%A5%B3%E5%AD%90%E3%81%A7%E3%81%99%E3%81%8C.png` (image/png, 244030 bytes, 640x908) |  |  |  |
| details author | PASS | 宇賀ミユキ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 連載中 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | インテリアメーカーで働く杉野加奈（29）は、好きな物に囲まれた仕事と自由な暮らしを満喫する“ソロ女子”。 今の生活に満足している──はずなのに、周囲の結婚や出産をきっかけに将来への不安を抱き始めている。 けれど加奈が恋愛に踏み出せないのは、元カレに言い捨てられた「おまえは一生ひとりが向いている」という言葉が、今も心に刺さっているからだった。 そんな矢先、加奈の自宅が火災になったことで、上司の家で同居生活をすることに。 しかもその上司は、職場では「冷徹上司」と恐れられる存在。けれど同じ屋根の下で見せるのは、仕事中とは全く違う顔で──…？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.yomonga.com/.../uIcaXZH9.jpg` (image/jpeg, 657257 bytes, 1624x2305) |  |  |  |
