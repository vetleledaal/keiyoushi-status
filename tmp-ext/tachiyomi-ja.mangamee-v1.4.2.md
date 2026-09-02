# Extension Validation Report

- Extension: tachiyomi-ja.mangamee-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5152016637336953348
- Source name: MangaMee
- Source language: ja
- Selected manga input: latest offset 0: ふるえる唇で恋 (`.../54461`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 恋するリップ・ティント (`.../54163`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 66 | ふるえる唇で恋 (`.../54461`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ふるえる唇で恋 (`.../54461`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ふるえる唇で恋 (`.../54461`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 8 | 1話 ただ笑って (`.../268454`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 66 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ふるえる唇で恋, URL=`54461` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 117/117 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 117/117 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://prod-img.manga-mee.jp/.../11183.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 71180 bytes, 1125x666) |  |  |  |
| details identity | PASS | Details preserved selected URL `54461` |  |  |  |
| details thumbnail URL | PASS | `https://prod-img.manga-mee.jp/.../11183.webp <redacted query values: hash and expires>` |  |  |  |
| details author | PASS | ただのゆう |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | クール男子, 恋愛.../%E5%AD%A6%E5%9C%92, キュンとする |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 話し言葉が思うように出てこない吃音症を抱える篠原優希。母親の再婚をきっかけに、田舎の学校に転校するが、また周りのみんなを失望させることに怯え、話すことを諦めていた。そんな優希の心をほどいていったのは、クラスメイト・岩井朝春のまっすぐで心ほどける優しさだった。<br>「なにか特別な言葉が欲しいわけじゃなかった」<br>彼との出会いが、閉じ込めていた想いを動かしていく。勇気と言葉を見つける、吃音少女×硬派男子の青春ラブストーリー！<br><br>Alternative Title: ふるえるくちびるでこい |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | LINT | All 8 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=8 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://prod-img.manga-mee.jp/.../21073124.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 96734 bytes, 760x1194) |  |  |  |
