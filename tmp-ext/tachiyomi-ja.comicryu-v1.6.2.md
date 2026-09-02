# Extension Validation Report

- Extension: tachiyomi-ja.comicryu-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 516402804198118822
- Source name: Comic Ryu
- Source language: ja
- Selected manga input: popular offset 0: ZINGNIZE (`.../zingnize`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | ZINGNIZE (`.../zingnize`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | ZINGNIZE (`.../40758`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 38 | アリスと蔵六 (`.../alicetozouroku`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ZINGNIZE (`.../zingnize`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 13 | 第一話「高坂甚内①」 (`.../2167`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 14: title=ZINGNIZE, URL=`.../zingnize` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 54/54 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 54/54 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.comic-ryu.jp/.../Ryu_banner672_zingnize.jpg` -> 2 manga URLs (examples: `.../zingnize`, `.../40758`), `https://www.comic-ryu.jp/.../Ryu_banner672_hitomi.webp` -> 2 manga URLs (examples: `.../hitomisenseinohokenshitsu`, `.../40873`), `https://www.comic-ryu.jp/.../kokudoushokudou_thumbnail.jpg` -> 2 manga URLs (examples: `.../kokudoushokudou`, `.../40787`), `https://www.comic-ryu.jp/.../Ryu_banner672_yuuhone.jpg` -> 2 manga URLs (examples: `.../40543`, `.../mukashiyuusyadeimahahone`), `https://www.comic-ryu.jp/.../Ryu_banner_dodododo_R.jpg` -> 2 manga URLs (examples: `.../40288`, `.../dodododo`), `https://www.comic-ryu.jp/.../Ryuweb_900x400_ryuguhotel_b_thumbnail.jpg` -> 2 manga URLs (examples: `.../40612`, `.../ryuuguu`), `https://www.comic-ryu.jp/.../Ryu_banner672_futsuu.jpg` -> 2 manga URLs (examples: `.../40688`, `.../hutsuunoonnanokonimodoritai`), `https://www.comic-ryu.jp/.../300300.jpg` -> 2 manga URLs (examples: `.../40450`, `.../nonderi`), `https://www.comic-ryu.jp/.../%E3%82%AE%E3%83%A3%E3%83%AB%E5%B0%BA_%E6%AD%A3%E6%96%B9%E5%BD%A2%E3%83%90%E3%83%8A%E3%83%BC.jpg` -> 2 manga URLs (examples: `.../40484`, `.../galshakuageage`), `https://www.comic-ryu.jp/.../Ryu_banner672_nekoyashiki.jpg` -> 2 manga URLs (examples: `.../40512`, `.../kabekoji`), `https://www.comic-ryu.jp/.../%E5%BD%B1%E6%8A%80%E3%82%A2%E3%82%A4%E3%82%B3%E3%83%B3-2.jpg` -> 2 manga URLs (examples: `.../40318`, `.../shadowskilldawn`), `https://www.comic-ryu.jp/.../Ryu_banner672_bretagne.jpg` -> 2 manga URLs (examples: `.../40343`, `.../bretagnehanayomeibun`), `https://www.comic-ryu.jp/.../Ryuweb_umagyaru_banner_900x400_b_thumbnail.jpg` -> 2 manga URLs (examples: `.../40375`, `.../umagal`) |  |  |  |
| thumbnail | PASS | `https://www.comic-ryu.jp/.../Ryu_banner672_zingnize.jpg` (image/jpeg, 469112 bytes, 672x672) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../zingnize` |  |  |  |
| details thumbnail URL | PASS | `https://www.comic-ryu.jp/.../Ryu_banner672_zingnize.jpg` |  |  |  |
| details author | PASS |  わらいなく |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 脅威のスピード感で贈る忍術VS忍術、盗賊VS盗賊の壮絶なる闘い！　江戸創世期の闇を、三人の甚内たちが斬る！ |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | LINT | All 13 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=13 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://comic-ryu-2024.crap.jp/.../ZINGNIZE-01-01.jpg` (image/jpeg, 3619874 bytes, 1350x1920) |  |  |  |
