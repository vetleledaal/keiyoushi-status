# Extension Validation Report

- Extension: tachiyomi-es.lmtoonline-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7732736838916328250
- Source name: Lmtos
- Source language: es
- Selected manga input: popular offset 0: Dokushin Kizoku: Danjohi 1:99 Sekai no Akuyaku Reisoku (`.../dokushin-kizoku-danjohi-1-99-sekai-no-akuyaku-reisoku`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 14 | Dokushin Kizoku: Danjohi 1:99 Sekai no Akuyaku Reisoku (`.../dokushin-kizoku-danjohi-1-99-sekai-no-akuyaku-reisoku`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Sangeki (`.../sangeki`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Osananajimi-tachi ga Ninki Idol ni Natta: Amaama na Kanojo-tachi wa Ore ni Mitsuide Kureteiru (`.../osananajimi-tachi-ga-ninki-idol-ni-natta-amaama-na-kanojo-tachi-wa-ore-ni-mitsuide-kureteiru`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Dokushin Kizoku: Danjohi 1:99 Sekai no Akuyaku Reisoku (`.../dokushin-kizoku-danjohi-1-99-sekai-no-akuyaku-reisoku`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Dokushin Kizoku: Danjohi 1:99 Sekai no Akuyaku Reisoku (`.../dokushin-kizoku-danjohi-1-99-sekai-no-akuyaku-reisoku`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 14 | Cap. 1 (`.../capitulo-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dokushin Kizoku: Danjohi 1:99 Sekai no Akuyaku Reisoku, URL=`dokushin-kizoku-danjohi-1-99-sekai-no-akuyaku-reisoku` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.lmtos.net/.../cover-1-mqciwbj5-34910f8e.webp` (image/webp (encoding: lossy), 90630 bytes, 500x711) |  |  |  |
| details identity | PASS | Details preserved selected URL `dokushin-kizoku-danjohi-1-99-sekai-no-akuyaku-reisoku` |  |  |  |
| details thumbnail URL | PASS | `https://img.lmtos.net/.../cover-1-mqciwbj5-34910f8e.webp` |  |  |  |
| details author | PASS | Masai |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Comedia, Isekai, Ecchi, Romance, Harem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Takayuki Shinohara (32), un bibliotecario, se ve atrapado en un terremoto y despierta en otro mundo. Al parecer, ahora es hijo de un noble de alto rango, y despierta justo en el lugar donde su propio compromiso es cancelado... Con su habilidad para leer la mente, tratara de vivir en un mundo escaso de hombres<br><br>Nombres alternativos: Telepathic Aristocrat ~Villainous Young Noble in a World with a 1:99 Male-to-Female Ratio~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.lmtos.net/.../001-mqcj7fb2-6f632ccf.webp` (image/webp (encoding: lossy), 117234 bytes, 1000x1422) |  |  |  |
