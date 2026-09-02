# Extension Validation Report

- Extension: tachiyomi-tr.turkcemangaoku-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1213201447439140959
- Source name: Türkçe Manga Oku
- Source language: tr
- Selected manga input: popular offset 0: Blue Lock Manga (`.../1230`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Blue Lock Manga (`.../1230`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Evrilen Bir Uzay Yaratığı Oldum (`.../1267`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Ölüm Hükümdarı (`.../1956`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Yalnız Diriliş (`.../1870`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Blue Lock Manga (`.../1230`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock Manga (`.../1230`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 305 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 76 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock Manga, URL=`1230` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://trmangaoku.com/.../blue-lock-manga-oku-175x238.png` (image/png, 55153 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1230` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://trmangaoku.com/.../blue-lock-manga-oku-193x278.png` (image/png, 67893 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Shounen, Spor |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Blue Lock<br><br>Blue Lock Manga Oku<br><br>Özet<br><br>Japonya, 2018 FIFA Dünya Kupası’ndan elendikten sonra, Japon Futbol Birliği geleceğe yönelik radikal bir adım atarak Blue Lock Projesi için 2022 Dünya Kupası için lise düzeyindeki yetenekli futbolcuları keşfetmeye yönelik yeni bir program başlattı. Bu programın odak noktalarından biri, takımının Ulusal turnuvaya katılma şansını kaybetmesine neden olan genç forvet Isagi Youichi. Maçın kritik anında, oyunu değiştirecek golü atmak yerine daha az yetenekli bir takım arkadaşına pas vermeyi tercih eden Isagi, bu olayla kariyerinde büyük bir dönüm noktası yaşar.<br><br>Bu yenilikçi programın arkasındaki isim olan antrenör Ego Jinpachi, Japon futbolunu kökten değiştirmeyi ve dünyanın en büyük bencil forvetini yaratmayı hedefliyor. Ego Jinpachi “Blue Lock” adı verilen, hapishane benzeri bir tesiste toplanır ve burada benzersiz ve zorlu bir eğitim sürecine tabi tutulur. Bu süreç, yalnızca en güçlü, en kararlı ve en yetenekli oyuncuların hayatta kalmasını ve gerçek futbol yıldızlarına dönüşmesini sağlar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 305 chapters |  |  |  |
| chapter dates | PASS | 305 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://trmangaoku.com/.../01.jpg` (image/jpeg, 165788 bytes, 1070x1600) |  |  |  |
