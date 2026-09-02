# Extension Validation Report

- Extension: tachiyomi-tr.sunsetmanga-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6406690174131145499
- Source name: Sunset Manga
- Source language: tr
- Selected manga input: latest offset 0: The Law of Garbage (`.../4501`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Selfish Romance (`.../3665`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | I’ll Take That Marriage This Time (`.../3934`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The Law of Garbage (`.../4501`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Darling, Why Do You Regret It? (`.../3601`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Law of Garbage (`.../4501`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Law of Garbage (`.../4501`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 53 | 1. Bölüm (`.../1-bolum`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Law of Garbage, URL=`4501` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.sunsetmanga.com/.../giris-yapiniz.jpg` -> 12 manga URLs (examples: `2785`, `4499`, `4635`) |  |  |  |
| thumbnail | PASS | `https://sunsetmanga.com/.../thumbnail_IMAG21_64458d10-eeb8-45f2-920f-c6814cc9f8ad-350x476.jpg` (image/jpeg, 49885 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `4501` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sunsetmanga.com/.../thumbnail_IMAG21_64458d10-eeb8-45f2-920f-c6814cc9f8ad.jpg` (image/jpeg, 67841 bytes, 480x623) |  |  |  |
| details author | PASS | Seoyeon |  |  |  |
| details artist | PASS | Seoyeon |  |  |  |
| details genres | PASS | Dram, Okul Hayatı, Romantik, Shoujo, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Eski erkek arkadaşı yüzünden üç yıllık bir ara vermek zorunda kalan Seon Yi-hyeon nihayet üniversiteye geri dönmüştür. Daha fazla dramadan uzak durmaya kararlı olan Seon, kalan kampüs hayatını huzur içinde geçirmeyi dilemektedir. Ancak eski sevgilisinden bile daha büyük bir pislik olan Nam Chan-woo ortaya çıktığında kaderin başka planları vardır! Ondan uzak durmaya çalışan Yi-hyun’un yolu sürekli onunla kesişir ve daha da kötüsü, aynı pansiyonda kalmaya başlarlar!<br><br>Yi-hyun Chan-woo’yu kendinden uzaklaştırmaya çalıştıkça, Chan-woo ona daha da sıkı sarılır ve büyüleyici ve beklenmedik bir kampüs aşkına ortam hazırlar.<br><br><br><br>Alternative Names: Law of Trashy Men/ The Law of a Jerk/쓰레기의 법칙 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | PASS | 53 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sunsetmanga.com/.../1.webp` (image/webp (encoding: lossy), 300808 bytes, 1920x1080) |  |  |  |
