# Extension Validation Report

- Extension: tachiyomi-tr.mangakulesi-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: uzaymanga
- Source ID: 6081935924304798514
- Source name: Manga Kulesi
- Source language: tr
- Selected manga input: popular offset 0: Ölümcül Sevimlilik (`.../olumcul-sevimlilik`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Ölümcül Sevimlilik (`.../olumcul-sevimlilik`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Cehennemden Doğan İblis Tanrı (`.../cehennemden-dogan-iblis-tanri`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ölümcül Sevimlilik (`.../olumcul-sevimlilik`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ölümcül Sevimlilik (`.../olumcul-sevimlilik`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Bölüm 1 (`.../1-bolum-oku`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ölümcül Sevimlilik, URL=`.../olumcul-sevimlilik` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 26/26 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 26/26 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangakulesi.com/.../d358ab6c-a21a-49b4-b3e1-2c2631a6b1f7.avif` (image/avif (format: avif), 105791 bytes, 723x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../olumcul-sevimlilik` |  |  |  |
| details thumbnail URL | PASS | `https://mangakulesi.com/.../d358ab6c-a21a-49b4-b3e1-2c2631a6b1f7.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <p>Onlar ilk bakışta tamamen zararsız, masum ve hatta son derece sevimli görünüyorlardı. İnsanlık da tam olarak bu görüntüye aldandı ve bunun karşılığında korkunç bir bedel ödedi. Sevimli canlıların acımasız yırtıcılara dönüşmesiyle birlikte şehirler birer birer düştü, toplum düzeni çöktü ve dünya geri dönüşü olmayan bir kıyametin içine sürüklendi.<.../p%3E%3Cp%3EArt%C4%B1k yasaların, güvenli bölgelerin veya insanları koruyabilecek bir sistemin bulunmadığı bu harap dünyada geçerli olan tek bir kural vardır: Savaş ya da öl. Hayatta kalmak isteyen herkes, masum görünümlerinin ardında ölümcül bir tehlike saklayan bu yaratıklara karşı mücadele etmek zorundadır.<.../p%3E%3Cp%3EY%C4%B1k%C4%B1nt%C4%B1lar, kan ve alevlerle çevrili bir dünyada o da yaşamını sürdürebilmek için amansız bir direniş yolculuğuna çıkar. Çünkü düşmanlarının karşısında bir an bile tereddüt etmek, kaçınılmaz bir ölüm anlamına gelmektedir.<.../p%3E |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | PASS | 25 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangakulesi.com/.../1__m2r5ef.avif` (image/avif (format: avif), 22823 bytes, 1024x1536) |  |  |  |
