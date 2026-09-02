# Extension Validation Report

- Extension: tachiyomi-tr.nirvanamanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2783611133798677654
- Source name: Nirvana Manga
- Source language: tr
- Selected manga input: popular offset 0: Operation: True Love (`.../operation-true-love`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Operation: True Love (`.../operation-true-love`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Operation: True Love (`.../operation-true-love`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Operation: True Love (`.../operation-true-love`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 110 | Bölüm 0 (`.../operation-true-love-bolum-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 52/52 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 52/52 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nirvanamanga.com/.../thumbnail_IMAG21_30c77a8d-ada1-40f8-b87a-d02bb05e7e13-231x300.jpg` (image/jpeg, 34270 bytes, 231x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../operation-true-love` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nirvanamanga.com/.../thumbnail_IMAG21_30c77a8d-ada1-40f8-b87a-d02bb05e7e13.jpg` (image/jpeg, 64085 bytes, 480x623) |  |  |  |
| details author | PASS | kkokkalee |  |  |  |
| details artist | PASS | Dledumb |  |  |  |
| details genres | PASS | Doğaüstü, Dram, Okul hayatı, Romantizm, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Erkek arkadaşım ve en iyi arkadaşımın öpüşmelerine şahit oldum. Şanssız sınıf arkadaşı ”Go Eun-Hyuk” ile kafası karıştı… Her insanın yaşamı boyunca alacağı sabit bir sevgi miktarı var mı? Ve alabileceğim sevgi miktarı neden sıfır? Soo-Ae, Eun-Hyuk ile birlikte kaderini değiştirmeye çalışıyor. Sadece bir ilişki içerisindelermiş gibi davranıyorlardı ama bu gerçeğe mi dönüşüyor? İşe yarayacak mı?<br><br>Alternative Names: Pure Love Operation, Chiến lược tình yêu trong sáng, Operación: Amor Puro, Operation Name Pure Love, Operation: Name Pure Love, Operation: True Love, ปฏิบัติการรักวุ่นหัวใจ, 代号纯情, 作戦名は純情, 作戰名純情, 작전명 순정 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | PASS | 110 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://nirvanamanga.com/.../1-11.jpg` (image/jpeg, 117035 bytes, 647x397) |  |  |  |
