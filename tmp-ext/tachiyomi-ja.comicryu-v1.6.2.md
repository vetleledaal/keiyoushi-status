# Extension Validation Report

- Extension: tachiyomi-ja.comicryu-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 3
- Warnings: 2
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
- Selected manga input: popular offset 0: ふつうのおんなのこにもどりたい (`.../hutsuunoonnanokonimodoritai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | ふつうのおんなのこにもどりたい (`.../hutsuunoonnanokonimodoritai`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | ふつうのおんなのこにもどりたい (`.../40983`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 38 | アリスと蔵六 (`.../alicetozouroku`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ふつうのおんなのこにもどりたい (`.../hutsuunoonnanokonimodoritai`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 【第1話】 (`.../5121`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 10s+ |

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
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 26: title=ふつうのおんなのこにもどりたい, URL=`.../hutsuunoonnanokonimodoritai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.comic-ryu.jp/.../Ryu_banner672_futsuu.jpg` -> 2 manga URLs (examples: `.../hutsuunoonnanokonimodoritai`, `.../40983`), `https://www.comic-ryu.jp/.../Ryu_banner672_tanuki_a-cc_ol.jpg` -> 2 manga URLs (examples: `.../tanutanu`, `.../40950`), `https://www.comic-ryu.jp/.../Ryu_banner672_boobymovie_a.jpg` -> 2 manga URLs (examples: `.../boobymovie`, `.../40928`), `https://www.comic-ryu.jp/.../Ryu_banner672_zingnize.jpg` -> 2 manga URLs (examples: `.../40758`, `.../zingnize`), `https://www.comic-ryu.jp/.../kokudoushokudou_thumbnail.jpg` -> 2 manga URLs (examples: `.../40787`, `.../kokudoushokudou`), `https://www.comic-ryu.jp/.../Ryu_banner672_hitomi.webp` -> 2 manga URLs (examples: `.../40873`, `.../hitomisenseinohokenshitsu`), `https://www.comic-ryu.jp/.../Ryu_banner672_yuuhone.jpg` -> 2 manga URLs (examples: `.../40543`, `.../mukashiyuusyadeimahahone`), `https://www.comic-ryu.jp/.../Ryu_banner_dodododo_R.jpg` -> 2 manga URLs (examples: `.../40288`, `.../dodododo`), `https://www.comic-ryu.jp/.../Ryuweb_900x400_ryuguhotel_b_thumbnail.jpg` -> 2 manga URLs (examples: `.../40612`, `.../ryuuguu`), `https://www.comic-ryu.jp/.../300300.jpg` -> 2 manga URLs (examples: `.../40450`, `.../nonderi`), `https://www.comic-ryu.jp/.../%E3%82%AE%E3%83%A3%E3%83%AB%E5%B0%BA_%E6%AD%A3%E6%96%B9%E5%BD%A2%E3%83%90%E3%83%8A%E3%83%BC.jpg` -> 2 manga URLs (examples: `.../40484`, `.../galshakuageage`), `https://www.comic-ryu.jp/.../Ryu_banner672_nekoyashiki.jpg` -> 2 manga URLs (examples: `.../40512`, `.../kabekoji`) |  |  |  |
| thumbnail | PASS | `https://www.comic-ryu.jp/.../Ryu_banner672_futsuu.jpg` (image/jpeg, 308176 bytes, 672x672) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hutsuunoonnanokonimodoritai` |  |  |  |
| details thumbnail URL | PASS | `https://www.comic-ryu.jp/.../Ryu_banner672_futsuu.jpg` |  |  |  |
| details author | PASS |  ふみふみこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【LINEマンガ】で大人気…28歳元アイドルと高校生クール男子のラブストーリー。 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://comic-ryu.jp` to `https://www.comic-ryu.jp` (1 redirects); popular: `https://comic-ryu.jp` to `https://www.comic-ryu.jp` (1 redirects); popular: `https://comic-ryu.jp/.../hutsuunoonnanokonimodoritai` to `https://www.comic-ryu.jp/.../hutsuunoonnanokonimodoritai` (1 redirects); popular: `https://comic-ryu.jp/.../%E3%82%B7%E3%83%AA%E3%83%BC%E3%82%BA%E4%B8%80%E8%A6%A7-%E9%80%A3%E8%BC%89%E4%B8%AD` to `https://www.comic-ryu.jp/.../%E3%82%B7%E3%83%AA%E3%83%BC%E3%82%BA%E4%B8%80%E8%A6%A7-%E9%80%A3%E8%BC%89%E4%B8%AD` (1 redirects); popular: `https://comic-ryu.jp/.../5121` to `https://www.comic-ryu.jp/.../5121` (1 redirects) |  |  |  |
| page load | PASS | `https://comic-ryu-2024.crap.jp/.../onnanoko-001-001.jpg` (image/jpeg, 1717475 bytes, 1800x2560) |  |  |  |
