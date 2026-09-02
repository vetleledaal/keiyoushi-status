# Extension Validation Report

- Extension: tachiyomi-tr.eskimangalar-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 455290087526139932
- Source name: Eski Mangalar
- Source language: tr
- Selected manga input: latest offset 0: Hileli Gücüm Var Ama Tarikatın En Zayıfıyım?! (`.../hileli-gucum-var-ama-tarikatin-en-zayifiyim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Geçmişten Gelen Oyuncu (`.../gecmisten-gelen-oyuncu`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Ben Gerçekten Kötü Biri Değilim (`.../ben-gercekten-kotu-biri-degilim`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Hileli Gücüm Var Ama Tarikatın En Zayıfıyım?! (`.../hileli-gucum-var-ama-tarikatin-en-zayifiyim`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Ölmeye Çalıştıkça Güçlenen Adam (`.../olmeye-calistikca-guclenen-adam`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hileli Gücüm Var Ama Tarikatın En Zayıfıyım?! (`.../hileli-gucum-var-ama-tarikatin-en-zayifiyim`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hileli Gücüm Var Ama Tarikatın En Zayıfıyım?! (`.../hileli-gucum-var-ama-tarikatin-en-zayifiyim`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | Bölüm 1 (`.../1-bolum-oku`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hileli Gücüm Var Ama Tarikatın En Zayıfıyım?!, URL=`.../hileli-gucum-var-ama-tarikatin-en-zayifiyim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-es.efsaneler2.can.re/.../43ada483-b3b1-4e3a-bb13-e4b00a147b99.avif` (image/avif (format: avif), 91687 bytes, 810x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hileli-gucum-var-ama-tarikatin-en-zayifiyim` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-es.efsaneler2.can.re/.../43ada483-b3b1-4e3a-bb13-e4b00a147b99.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Macera, Murim, Sistem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <p>Tarikattaki kıdemli ve küçük kardeşlerimin hepsi, geçmiş yaşamlarında dünyayı sarsmış kudretli kişilermiş. Ben ise yan şehirlerden birinde yaşayan sıradan biriyken, ustam tarafından kandırılıp buraya getirilen ve herkese bakıcılık yapmak zorunda kalan zavallının tekiyim!<.../p%3E%3Cp%3ENeyse ki bu tarikatın sağladığı güçlendirmeler oldukça fazla. Üstelik şans eseri <strong>Yakınlık Değeri Ansiklopedi Sistemi<.../strong%3Eni uyandırdım!<.../p%3E%3Cp%3EG%C3%BC%C3%A7l%C3%BC kişilerin kayıtlarını topla, yakınlık puanı kazan ve onların yeteneklerini kullan! Böyle bir sistemle güçlenmek gerçekten inanılmaz!<.../p%3E |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-es.efsaneler2.can.re/.../1__szlqbc.avif` (image/avif (format: avif), 22823 bytes, 1024x1536) |  |  |  |
